package com.jpa.demospringjpa.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jpa.demospringjpa.model.Product;
import com.jpa.demospringjpa.model.TUser;
import com.jpa.demospringjpa.service.TUserService;

@Controller
public class TUserController {
	
	@Autowired
    private TUserService service;
	// handler methods...

	private TUser tUser;

	@RequestMapping("/tuser")
	public String viewtUserHomePage(Model model) {
		List<TUser> listTUser = service.listAll();
		model.addAttribute("listTUser", listTUser);

		tUser = new TUser();
		model.addAttribute("userform", tUser);

		return "tuser_view/index_tuser";
	}

	@RequestMapping("/newtuser")
	public String showNewTUserPage(Model model) {

		tUser = new TUser();
		model.addAttribute("tUser", tUser);
		
		return "tuser_view/new_tuser";
	}

	@RequestMapping(value = "/savetuser", method = RequestMethod.POST)
	public String saveTUser(@ModelAttribute("tuser") TUser tUser) {	
//		String -> Date
//		SimpleDateFormat.parse(String);
		service.save(tUser);

		return "redirect:/tuser";
	}

	@RequestMapping("/edittuser/{id}")
	public ModelAndView showEditTUserPage(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("tuser_view/edit_tuser");
		TUser tUser = service.get(id);
		mav.addObject("tuser", tUser);

		return mav;
	}

	@RequestMapping("/deletetuser/{id}")
	public String deleteTUser(@PathVariable(name = "id") Long id) {
		service.delete(id);
		return "redirect:/tuser";
	}
	
	@RequestMapping("/searchuser")
	public ModelAndView searchUserPage(@ModelAttribute(name = "userform") TUser userForm) {
		ModelAndView mav = new ModelAndView("tuser_view/index_tuser");
		
		List <TUser> listUser = service.searchUser(userForm.getUserName());
		mav.addObject("listTUser", listUser);
		
		return mav;
	}
	
//	@RequestMapping("/search")
//	public ModelAndView searchProductPage(@ModelAttribute(name = "productform") Product productForm) {
//		ModelAndView mav = new ModelAndView("index");
//
//		List<Product> listProducts = service.search(productForm.getName());
//		mav.addObject("listProducts", listProducts);
//
//		return mav;
//	}

}
