package com.devkoo.demo.web;

import com.devkoo.demo.domain.posts.PostsRepository;
import com.devkoo.demo.dto.account.AccountSaveRequestDto;
import com.devkoo.demo.dto.posts.PostsSaveRequestDto;
import com.devkoo.demo.service.AccountService;
import com.devkoo.demo.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {
    private PostsRepository postsRepository;
    private PostsService postsService;
    private AccountService accountService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot";
    } // 조금 더 응용해서 다른 문구도 출력가능하게

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }

    @PostMapping("/account")
    public Long saveAccount(@RequestBody AccountSaveRequestDto dto) {
        return accountService.save(dto);
    }
}

