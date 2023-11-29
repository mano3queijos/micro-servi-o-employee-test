package com.example.employeeservice.repository;

import com.example.employeeservice.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    Optional<Manager> findById(Long id);

}


