package com.example.lab_complex.repositories;

import com.example.lab_complex.eventmanagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestEventRepository extends JpaRepository<Event, Long> {
    // Métodos personalizados para pruebas
    List<Event> findByLocation(String location);
}
