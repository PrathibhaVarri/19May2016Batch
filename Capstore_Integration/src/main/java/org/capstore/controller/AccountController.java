package org.capstore.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.capstore.model.Admin;
import org.capstore.model.Category;
import org.capstore.model.Customer;
import org.capstore.model.Discount;
import org.capstore.model.Merchant;
import org.capstore.model.mail;
import org.capstore.model.Product;
import org.capstore.service.CapstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class AccountController {
	

	boolean flag;
	
	@Autowired
	private CapstoreService capstoreService;
	

	@RequestMapping(method=RequestMethod.GET)
	public String showCategories(ModelMap map){
		map.put("category", new Category());
		map.put("Product", new Product());
		map.put("categories", capstoreService.getAllCategories());
		map.put("products", capstoreService.getProductDetails());
		return "CapstoreHomePage";
	} 
	
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	public String signInCustomer(ModelMap map){
		map.put("customer", new Customer());
		return "CustomerSignInPage";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home()
	{
		return "redirect:/";
	}
	
	@RequestMapping(value="/custhomepage",method=RequestMethod.GET)
	public String custhome()
	{
		return "custhomepage";
	}
	
	@RequestMapping(value="/CustomerLogIn",method=RequestMethod.GET)
	public String logInCustomer(ModelMap map){
		map.put("customer", new Customer());
		return "CustomerLogIn";
	}
	
	@RequestMapping(value="/mail",method=RequestMethod.GET)
	public ModelAndView mail(){
		return new ModelAndView("mail","mail",new mail());
	}
	
	@RequestMapping(value="/saveCustomer",method=RequestMethod.POST)
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result){
		if(result.hasErrors()){
			return "CustomerSignInPage";
		}else{
			capstoreService.saveCustomer(customer);
			return "redirect:/";
		}
	}
	
	@RequestMapping(value="/merchant",method=RequestMethod.GET)
	public String signInMerchant(ModelMap map){
		map.put("merchant", new Merchant());
		return "MerchantSignIN";
	}
	
	@RequestMapping(value="/MerchantLogIn",method=RequestMethod.GET)
	public String logInMerchant(ModelMap map){
		map.put("merchant", new Merchant());
		return "MerchantLogIn";
	}	
	
	@RequestMapping(value="/saveMerchant",method=RequestMethod.POST)
	public String saveMerchant(@Valid @ModelAttribute("merchant") Merchant merchant, BindingResult result){
		if(result.hasErrors()){
			return "MerchantSignIN";
		}else{
			capstoreService.saveMerchant(merchant);
			return "redirect:/";
		}
	}
	
	@RequestMapping(value="/mer_login",method=RequestMethod.POST)
	public String merchantLogin(@ModelAttribute("merchant") Merchant merchant)
	{	
		if(capstoreService.merchantlogin(merchant))
		{
		return "merchantPage";
		}
		else
		{
			return "redirect:/";
		}
	}
	
	@RequestMapping("/listAll")
	public ModelAndView showMerchants(){
		return new ModelAndView("listAll","listOfMerchants",capstoreService.getAllMerchants());
	}
	
	@RequestMapping(value="/discount",method=RequestMethod.GET)
	public ModelAndView showDiscountForm(){
		return new ModelAndView("discount","discount",new Discount());
	}
	
	@RequestMapping(value="/saveDiscount", method=RequestMethod.POST)
	public String saveDiscount(@Valid @ModelAttribute("discount") Discount discount,BindingResult result){
		if(result.hasErrors()){
			System.out.println(discount);
			return "discount";
		}
		else{
			//System.out.println("FIne");
			capstoreService.saveDiscount(discount);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/listAllCustomers")
	public ModelAndView showCustomers(){
		return new ModelAndView("listAllCustomers","listOfCustomers",capstoreService.getAllCustomers());
	}
	
	
	@RequestMapping(value="/cust_login",method=RequestMethod.POST)
	public String customerLogin(ModelMap map,@ModelAttribute("customer") Customer customer)
	{	
		if(capstoreService.customerlogin(customer))
		{
			map.put("category", new Category());
			map.put("Product", new Product());
			map.put("categories", capstoreService.getAllCategories());
			map.put("products", capstoreService.getProductDetails());
		return "custhomepage";
		}
		else
		{
			return "redirect:/";
		}
	}
	@RequestMapping(value="/AdminLogIn",method=RequestMethod.GET)
	public String logInAdmin(ModelMap map){
		map.put("admin", new Admin());
		return "AdminLogIn";
	}	
	
	@RequestMapping(value="/adm_login",method=RequestMethod.POST)
	public String saveAdmin(@ModelAttribute("admin")Admin admin)
	{
		if(capstoreService.login(admin))
		{return "AdminHome1";}
		else{
		return "redirect:/";
		}
	}
	

	@RequestMapping(value="/createCategory")
	public String getCategory(ModelMap map){
		map.put("category", new Category());
		map.put("categories", capstoreService.getAllCategories());
		return "CategoryForm";
		
	}
	
	@RequestMapping(value="/addcategory",method=RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result){
		if(result.hasErrors()){
			return "CategoryForm";
		}
		else{
			capstoreService.saveCategory(category);
			return "redirect:/";
		}
	}

	@RequestMapping(value="/createAdmin")
	public String createAdmin(ModelMap map){
		map.put("admin", new Admin());
		map.put("admins", capstoreService.getAllAdmins());
		return "AdminForm";	
	}
	
	@RequestMapping(value="/addAdmin")
	public String addAdmin(@Valid @ModelAttribute("admin") Admin admin,BindingResult result){
		if(result.hasErrors()){
			return "AdminForm";
		}
		else{
				flag=capstoreService.saveAdmin(admin);
				if(flag==true)
					return "redirect:/";
				else
					return "AdminForm";
		}
	}
	
	@RequestMapping(value="/changepwd",method=RequestMethod.GET)
	public String changePassword(ModelMap map){
		map.put("adminpwdchange", new Admin());
		return "changePassword";
	}
	
	@RequestMapping(value="/updatenewpassword",method=RequestMethod.POST)
	public String updatePassword(@ModelAttribute("adminpwdchange") Admin admin){
		boolean flag=capstoreService.updatePassword(admin);
		if(!flag)
			return "changePassword";
		else{
			return "AdminHome1";
		}
		
	}
	
	@ModelAttribute("categories")
	public List<Category> getAllTypes(){
		
		return capstoreService.getAllCategories();
	}
	
	@RequestMapping("/mens")
	public String showpage(ModelMap map){
		map.put("Product", new Product());
		map.put("category", new Category());
		map.put("merchant", new Merchant());
		
		map.put("products1",capstoreService.getProductDetails1());
		return ("mens");
	}
	
	@RequestMapping("/womens")
	public String showpage1(ModelMap map){
		map.put("Product", new Product());
		map.put("category", new Category());
		map.put("merchant", new Merchant());
		map.put("products2", capstoreService.getProductDetails2());
		return ("womens");
	}
	@RequestMapping("/kids")
	public String showpage2(ModelMap map){
		map.put("Product", new Product());
		map.put("category", new Category());
		map.put("merchant", new Merchant());
		map.put("products3", capstoreService.getProductDetails3());
		return ("kids");
	}
	@RequestMapping("/homeneeds")
	public String showpage3(ModelMap map){
		map.put("Product", new Product());
		map.put("category", new Category());
		map.put("merchant", new Merchant());
		map.put("products4", capstoreService.getProductDetails4());
		return ("homeneeds");
	}
	
	@RequestMapping("/Gadgets")
	public String showpage4(ModelMap map){
		map.put("Product", new Product());
		map.put("category", new Category());
		map.put("merchant", new Merchant());
		map.put("products5", capstoreService.getProductDetails5());
		return ("Gadgets");
}
	
	@RequestMapping("/sorted")
	public String showpage5(ModelMap map){
		map.put("Product", new Product());
		map.put("category", new Category());
		map.put("merchant", new Merchant());
		
		map.put("products6", capstoreService.getSorted());
		return ("sorted");
	}
	@RequestMapping("/sorted1")
	public String showpage6(ModelMap map){
		map.put("Product", new Product());
		map.put("category", new Category());
		map.put("merchant", new Merchant());
	
		map.put("products7", capstoreService.getSorted1());
		return ("sorted1");
	}
	}
	

