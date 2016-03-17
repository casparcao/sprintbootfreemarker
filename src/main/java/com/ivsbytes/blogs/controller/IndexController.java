package com.ivsbytes.blogs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value={"/", "/index"})
	public String index(Model model) throws Exception{
		List<String> list = new ArrayList<String>();
		list.add("马走日");
		list.add("象走田");
		model.addAttribute("haha", "hehe");
		model.addAttribute("list", list);
		return "index";
	}
}
