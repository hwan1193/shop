package com.shop.service;

import com.shop.dto.MemberFormDto;
import com.shop.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;

import javax.transaction.Transactional;

//@SpringBootTest
//@Transactional
//@TestPropertySource(locations = "classpath:application-test.properties")
public class MemberServiceTest {

//    @Autowired
//    MemberService memberService;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    public Member createMember(){
//        MemberFormDto memberFormDto = new MemberFormDto();
//        memberFormDto.setEmail("test@email.com");
//        memberFormDto.setName("김홍섭");
//        memberFormDto.setAddress("대전광역시 중구 용두동");
//        memberFormDto.setPassword("1234");
//        return Member.createMember(memberFormDto, passwordEncoder);
//    }
//
//    @Test
//    @DisplayName("회원가입 테스트")
//    public void saveMemberTest(){
//        Member member = createMember();
//        Member saveMember = memberService.saveMember(member);
//
//        //assertEq
//    }
}
