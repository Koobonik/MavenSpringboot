package com.devkoo.demo.service;

import com.devkoo.demo.domain.account.Account;
import com.devkoo.demo.domain.account.AccountRepository;
import com.devkoo.demo.service.AccountService;
import com.devkoo.demo.dto.account.AccountSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRepository accountRepository;

    @After
    public void cleanup () {
        accountRepository.deleteAll();
    }

    @Test
    public void Dto데이터가_account테이블에_저장된다 () {
        //given
        AccountSaveRequestDto dto = AccountSaveRequestDto.builder()
                //.usernum("테스트 아이디")
                //.useraccount("테스트 유저 아이디")
                .userpassword("테스트 패스워드")
                .build();

        //when
        accountService.save(dto);

        //then
        Account account= accountRepository.findAll().get(0);
        //assertThat(account.getusernum()).isEqualTo(dto.getusernum());
        //assertThat(account.getuserpassword()).isEqualTo(dto.getUseraccount());
        assertThat(account.getUserpassword()).isEqualTo(dto.getUserpassword());

    }


}
