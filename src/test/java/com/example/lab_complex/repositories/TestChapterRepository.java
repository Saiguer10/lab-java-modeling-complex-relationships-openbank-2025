package com.example.lab_complex.repositories;

import com.example.lab_complex.nursesassociation.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestChapterRepository extends JpaRepository<Chapter, Long> {

    List<Chapter> findByDistrict(String district);
}
