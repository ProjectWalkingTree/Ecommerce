package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.service.ProductServiceimp;

@Controller
public class productController {
	@Autowired
	private ProductServiceimp productService;

	@RequestMapping("/")
	public String home() {
		return "index";

	}

	@RequestMapping("/mobile")
	public String FindMobile(String subcat, Model m) {
		subcat = "mobile";
		m.addAttribute("product", productService.getAllProduct(subcat));
		return "showproducts";
	}

	@RequestMapping("/ac")
	public String FindAC(String subcat, Model m) {
		subcat = "AC";
		m.addAttribute("product", productService.getAllProduct(subcat));
		return "showproducts";
	}

	@RequestMapping("/laptop")
	public String FindLaptop(String subcat, Model m) {
		subcat = "laptop";
		m.addAttribute("product", productService.getAllProduct(subcat));
		return "showproducts";
	}

}