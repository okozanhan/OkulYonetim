/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCrud.aykutSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringCrud.aykutSpring.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
