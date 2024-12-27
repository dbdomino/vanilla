package com.vanilla.controller;

import com.vanilla.entity.Member;
import com.vanilla.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mem")
@Slf4j
public class MemberLoginController {
    private final MemberService memberService;
    @Autowired
    public MemberLoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/ind")
    public String index (){
        log.info("start index");
        return "index";
    }

    @GetMapping("/login") // 로그인 페이지로 이동
    public String loginPage() {
        log.info("start loginPage");
        return "signin";
    }

    @PostMapping("/login")
    public String loginProcess(@RequestParam("memberId") String memberId,
                               @RequestParam("memberPw") String memberPw,
                               Model model) {
        log.info("Controller login Id : {} , Pw : {}", memberId, memberPw);
        boolean isLoginSuccessful = memberService.login(memberId, memberPw);

        if (isLoginSuccessful) {
            model.addAttribute("memberId", memberId);  // 로그인 성공 시 ID를 모델에 추가
            return "home";  // 홈 페이지로 이동
//            return "redirect:/home";  // 로그인 성공시 홈으로 이동
        } else {
            model.addAttribute("error", "Invalid ID or Password");
            return "signin";  // 로그인 실패시 다시 로그인 페이지로 이동
        }
    }




    @GetMapping("/signupnow") // 회원가입
    public String signUpSample(Model model) {
        log.info("start signUpSample");
        String id = "minod";
        String pw = "minod";
        String name = "미노드";

        Member member = memberService.signUp(id,pw, name,"minod@dfd.com","01011112222","address---");

        model.addAttribute("memberId", member.getMemberId());  // 로그인 성공 시 ID를 모델에 추가
        return "page/signupsample";  // 홈 페이지로 이동
    }
}
