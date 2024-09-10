package com.sparta.basicspringsession10.repository;

import com.sparta.basicspringsession10.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
