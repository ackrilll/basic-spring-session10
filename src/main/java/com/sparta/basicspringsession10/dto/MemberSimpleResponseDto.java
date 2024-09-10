package com.sparta.basicspringsession10.dto;

import lombok.Getter;

@Getter
public class MemberSimpleResponseDto {
    private final Long memberId;
    private final String memberName;
    public MemberSimpleResponseDto(Long memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
}
