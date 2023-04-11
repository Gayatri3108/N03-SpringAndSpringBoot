package org.tnsif.placementmanagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagment.entities.Student;
import org.tnsif.placementmanagment.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	//addition/creation/insertion
	public void add(Student student)
	{
		repo.save(student);
	}
	//Retrieve with specific id
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	//to retrieve all the records
	public List<Student>retreiveAll()
	{
		return repo.findAll();
	}
}