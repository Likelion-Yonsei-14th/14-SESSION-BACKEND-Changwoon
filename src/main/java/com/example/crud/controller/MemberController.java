package com.example.crud.controller;

import com.example.crud.domain.Member;
import com.example.crud.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController // Rest API용 컨트롤러 선언
@RequestMapping("/api/members")
public class MemberController {
    private final MemberRepository repository;

    // 생성자 주입
    public MemberController(MemberRepository repository) {
        this.repository = repository;
    }

    // 회원등록
    @PostMapping
    public Member save(@RequestBody Member member) {
        return repository.save(member);
    }

    @GetMapping
    public List<Member> findAll() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Member update(@PathVariable Long id, @RequestBody Member memberDetails) {
        Member member = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No client. id =" + id));

        member.setName(memberDetails.getName());
        member.setEmail(memberDetails.getEmail());

        return repository.save(member);
    }
}
