package cn.leizhang.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.leizhang.domain.User;
import cn.leizhang.service.UserService;

/**
 * @author zhangsanshi
 * test for thymeleaf
 */
@Controller
public class TestController {
	@Autowired
	private UserService userService;
	@RequestMapping("/hello")
	public String thyMeleafTest(Model model)
	{
		User user=userService.selectUserById(1);
		model.addAttribute("user",user);
		return "hello";
	}
}
