package themeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.expression.Lists;
import themeleaf.bean.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThemeleafController {


	@RequestMapping("/index")
	public String index(){

		return "index";
	}

	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String helloTheme(Model model){
		model.addAttribute("name", "world");
		return "hello";
	}


	@RequestMapping(value="/hello2",method = RequestMethod.GET)
	public String helloTheme2(Model model){
//对象
		User user = new User();
		user.setName("ltc");
		user.setAge(20);


		model.addAttribute("user", user);
		return "test";
	}

	@RequestMapping(value="/hello3",method = RequestMethod.GET)
	public String helloTheme3(Model model){
//遍历
		User user = new User();
		user.setName("ltc");
		user.setAge(20);

		User user2 = new User();
		user2.setName("周悦");
		user2.setAge(20);

		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user2);

		model.addAttribute("users", users);
		return "test2";
	}

}
