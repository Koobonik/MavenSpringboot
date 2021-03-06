package com.devkoo.demo.web;

import com.devkoo.demo.service.AccountService;
import com.devkoo.demo.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Controller
@AllArgsConstructor
public class WebController implements WebMvcConfigurer { // 웹컨트롤러로써 GetMapping 이용해서 이곳 저곳 보낼 수 있음 return 값도 잘 이용하자

    private PostsService postsService;
    private AccountService accountService;
    @RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }

    @RequestMapping(value="signup", method = {RequestMethod.GET, RequestMethod.POST})
    public String signup(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "signup";
    }

    @RequestMapping(value="login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "login";
    }

    @RequestMapping(value="test", method = {RequestMethod.GET, RequestMethod.POST})
    public String test(Model model){
        model.addAttribute("account", accountService.findAllDesc());
        return "test";
    }

    @RequestMapping(value="home", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Model model){
        model.addAttribute("account", accountService.findAllDesc());
        return "home";
    }

    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(Model model){
        model.addAttribute("account", accountService.findAllDesc());
        return "hello";
    }
}
