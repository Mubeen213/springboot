package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //find a user by email - custom
//    @Query("SELECT s FROM Student s WHERE s.email = ?")
   Optional<Student> findStudentByEmail(String email);
}
