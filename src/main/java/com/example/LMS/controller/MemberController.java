package com.example.LMS.controller;

import com.example.LMS.entity.Member;
import com.example.LMS.model.MemberModel;
import com.example.LMS.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/members")
    public Member save(@RequestBody Member member) {
        return memberService.save(member);
    }

    @GetMapping("")
    public List<Member> findAll() {
        return memberService.findAll();
    }

    @GetMapping("/{id}")
    public Member findById(@PathVariable Long id) {
        return memberService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        memberService.delete(id);
    }
}


