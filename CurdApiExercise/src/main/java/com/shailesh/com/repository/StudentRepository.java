package com.shailesh.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shailesh.com.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
