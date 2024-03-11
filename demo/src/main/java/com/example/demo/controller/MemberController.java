package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired  // 생성자 주입 방식
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
