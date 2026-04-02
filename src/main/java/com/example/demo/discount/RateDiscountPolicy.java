package com.example.demo.discount;

import com.example.demo.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public double discount(Member member, int price) {
        if (member.getGrade().equals("VIP")) {
            return price / 10;
        }
        return 0;
    }
}
