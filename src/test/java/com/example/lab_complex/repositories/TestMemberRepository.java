package com.example.lab_complex.repositories;

import com.example.lab_complex.nursesassociation.model.Member;
import org.hibernate.engine.spi.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMemberRepository extends JpaRepository<Member, Long> {
    // Métodos personalizados para pruebas
    List<Member> findByStatus(Status status);
}
