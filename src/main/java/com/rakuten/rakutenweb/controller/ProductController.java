package com.rakuten.rakutenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rakuten.rakutenweb.model.Product;
import com.rakuten.rakutenweb.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> productList = productService.list();
		model.addAttribute("productList", productList);
	    return "index";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		productService.delete(id);
	    return "redirect:/";       
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("user") Product product, Model model) {
		System.out.println(product);
		productService.save(product);
	    return "redirect:/";
	}
	
}
