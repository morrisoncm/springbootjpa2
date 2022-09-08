package com.demo.jpa2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.jpa2.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  Student findByEmail(String email);
}
