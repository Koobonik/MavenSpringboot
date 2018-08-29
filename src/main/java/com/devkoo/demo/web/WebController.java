package com.devkoo.demo.web;

import com.devkoo.demo.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController { // 웹컨트롤러로써 GetMapping 이용해서 이곳 저곳 보낼 수 있음 return 값도 잘 이용하자

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }

    @GetMapping("signup")
    public String signup(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "signup";
    }

    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "login";
    }

    @GetMapping("home")
    public String home(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "home";
    }

    @GetMapping("hi")
    public String hi(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "hi";
    }
}