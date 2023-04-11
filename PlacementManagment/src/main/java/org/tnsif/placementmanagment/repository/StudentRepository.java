package org.tnsif.placementmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagment.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}