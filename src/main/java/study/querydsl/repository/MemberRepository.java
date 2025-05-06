package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.querydsl.entity.Member;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    // select m from Member m where m.username = ? <- 이렇게 쿼리가 날아간다.
    List<Member> findByUsername(String username);
}
