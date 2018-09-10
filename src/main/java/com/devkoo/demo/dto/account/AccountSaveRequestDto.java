package com.devkoo.demo.dto.account;

import com.devkoo.demo.domain.account.Account;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class AccountSaveRequestDto {

    private Long usernum;
    private String userid;
    private String userpassword;
    protected String useremail;

    @Builder
    public AccountSaveRequestDto(Long usernum, String userid, String useremail, String userpassword) {
        this.usernum = usernum;
        this.userid = userid;
        this.useremail = useremail;
        this.userpassword = userpassword;
    }

    public Account toEntity(){
        return Account.builder()
                .usernum(usernum)
                .userid(userid)
                .useremail(useremail)
                .userpassword(userpassword)
                .build();
    }
}