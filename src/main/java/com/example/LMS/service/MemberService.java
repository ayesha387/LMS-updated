package com.example.LMS.service;

import com.example.LMS.entity.Member;
import java.util.List;

public interface MemberService {

    Member save(Member member);
    List<Member> findAll();

    Member findById(Long id);

    void delete(Long id);
}

