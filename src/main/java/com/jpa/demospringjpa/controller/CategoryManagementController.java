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

import com.jpa.demospringjpa.model.MCategory;
import com.jpa.demospringjpa.model.Product;
import com.jpa.demospringjpa.service.MCategoryService;
import com.jpa.demospringjpa.service.ProductService;

@Controller

public class CategoryManagementController {
	@Autowired
    private MCategoryService service;
	// handler methods...

	private MCategory mCategory;
	
	@RequestMapping("/list_category")
	public String viewCategoryList(Model model) {
		List<MCategory> listCategorys = service.listAll();
		model.addAttribute("listCategorys", listCategorys);

		return "category/list_category";
	}
	
	@RequestMapping("/add_newcategory")
	public String addNewCategory(Model model) {
		mCategory = new MCategory();
		model.addAttribute("mCategory", mCategory);

		return "category/add_list_category";
	}
	
	@RequestMapping(value = "/savecategory", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("mCategory") MCategory mCategory) {
		service.save(mCategory);
		return "redirect:/list_category";
	}
	@RequestMapping("editCategory/{categoryId}")
	public ModelAndView showEditProductPage(@PathVariable(name = "categoryId") int id) {
		ModelAndView mav = new ModelAndView("category/edit_category");
		MCategory mCategory = service.get(id);
		mav.addObject("mCategory", mCategory);

		return mav;
	}

	@RequestMapping("deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable(name = "categoryId") int id) {
		service.delete(id);
		return "redirect:/list_category";
	}
}
