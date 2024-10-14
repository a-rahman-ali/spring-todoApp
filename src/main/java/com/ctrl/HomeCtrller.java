package com.ctrl;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.ToDo;

@Controller
public class HomeCtrller {

	@Autowired
	ServletContext context;

	@RequestMapping("/home")
	public String home(Model m) {
		String str1 = "home";
		m.addAttribute("page", str1);

		List<ToDo> list = (List<ToDo>) context.getAttribute("list");

		m.addAttribute("todos", list);

		return "home";
	}

	@RequestMapping("/add")
	public String addToDo(Model m) {
		ToDo t = new ToDo();

		m.addAttribute("page", "add");
		m.addAttribute("todo", t);
		return "home";
	}

	@RequestMapping(value = "/saveToDo", method = RequestMethod.POST)
	public String saveToDo(@ModelAttribute("todo") ToDo t, Model m) {

		System.out.println(t);

		List<ToDo> list = (List<ToDo>) context.getAttribute("list");
		list.add(t);
		m.addAttribute("msg", "successfully added...");

		return "home";
	}
}
