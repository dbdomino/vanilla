package com.vanilla.service;

import com.vanilla.domain.entity.Member;
import com.vanilla.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public boolean login(String memberId, String memberPw) {
        Optional<Member> memberOptional = memberRepository.findByIdPw(memberId, memberPw);
        return memberOptional.isPresent();
        // 로그인 성공이면 true, 실패면 false
    }
}
