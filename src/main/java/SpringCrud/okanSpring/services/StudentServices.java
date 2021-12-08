/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCrud.okanSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringCrud.okanSpring.model.Student;
import SpringCrud.okanSpring.repository.StudentRepository;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository repo;

    public List<Student> listAll() {
        return repo.findAll();
    }

    public void save(Student student) {
        repo.save(student);
    }

    public Student get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
