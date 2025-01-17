package com.example.cookers.domain.member.repository;

import com.example.cookers.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUsername(String username);
    Optional<Member> findByUsernameAndProviderTypeCode(String username, String providerTypeCode);

    List<Member> findByemail(String email);

    boolean existsByUsername(String username); // 중복 아이디 확인
    boolean existsByNickname(String nickname); // 중복 닉네임 확인

    List<Member> findAll();
}