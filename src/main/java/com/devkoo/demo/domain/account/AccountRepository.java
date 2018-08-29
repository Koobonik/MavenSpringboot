package com.devkoo.demo.domain.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("SELECT p " +
            "FROM Account p " +
            "ORDER BY p.usernum DESC")
    Stream<Account> findAllDesc();
}
