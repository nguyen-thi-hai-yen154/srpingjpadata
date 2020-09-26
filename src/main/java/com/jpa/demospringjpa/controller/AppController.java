package com.jpa.demospringjpa.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.jpa.demospringjpa.model.Product;
import com.jpa.demospringjpa.model.ProductForm;
import com.jpa.demospringjpa.service.ProductService;


@Controller
public class AppController {
	@Autowired
    private ProductService service;
	// handler methods...

	private Product product;

	@RequestMapping("list_product")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);


		product = new Product();
		model.addAttribute("productform", product);

		return "index";
	}

	@RequestMapping("/new")
	public String showNewProductPage(Model model) {

		product = new Product();
		model.addAttribute("product", product);

		return "new_product";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		service.save(product);
		return "redirect:/list_product";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = service.get(id);
		mav.addObject("product", product);

		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/list_product";
	}

	@RequestMapping("/search")
	public ModelAndView searchProductPage(@ModelAttribute(name = "productform") Product productForm) {
		ModelAndView mav = new ModelAndView("index");

		List<Product> listProducts = service.search(productForm.getName());
		mav.addObject("listProducts", listProducts);

		return mav;
	}


}
