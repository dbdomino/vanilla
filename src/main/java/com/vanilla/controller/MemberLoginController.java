package com.vanilla.controller;

import com.vanilla.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberLoginController {
    private final MemberService memberService;

    @Autowired
    public MemberLoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login") // 로그인 페이지로 이동
    public String loginPage() {
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam("memberId") String memberId,
                        @RequestParam("memberPw") String memberPw,
                        Model model) {
        boolean isLoginSuccessful = memberService.login(memberId, memberPw);

        if (isLoginSuccessful) {
            return "redirect:/home";  // 로그인 성공시 홈으로 이동
        } else {
            model.addAttribute("error", "Invalid ID or Password");
            return "login";  // 로그인 실패시 다시 로그인 페이지로 이동
        }
    }
}
