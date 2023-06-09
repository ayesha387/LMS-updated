package com.example.LMS.model;

import com.example.LMS.entity.Member;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.Date;
@Component
@Data
public class MemberModel {
    private Long id;
    private String name;
    private Long phoneNo;
    private String email;
    private String address;
    private Date joinDate;

    public Member disassemble() {
        Member member = new Member();
        member.setId(id);
        member.setName(name);
        member.setPhoneNo(phoneNo);
        member.setEmail(email);
        member.setAddress(address);
        member.setJoinDate(joinDate);
        return member;
    }

    public MemberModel assemble(Member member) {
        MemberModel memberModel = new MemberModel();
        memberModel.setId(member.getId());
        memberModel.setName(member.getName());
        memberModel.setPhoneNo(member.getPhoneNo());
        memberModel.setEmail(member.getEmail());
        memberModel.setAddress(member.getAddress());
        memberModel.setJoinDate(member.getJoinDate());
        return memberModel;
    }
}

