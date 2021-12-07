/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCrud.aykutSpring;

import SpringCrud.aykutSpring.model.Student;
import SpringCrud.aykutSpring.model.User;
import SpringCrud.aykutSpring.repository.StudentRepository;
import SpringCrud.aykutSpring.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class Tests {
    
    @Autowired
    private UserRepository repo;
    
    //Öğrenci Ekle
   /* @Test
    public void test() {
        Student student = new Student();
        student.setName("Mustafa");
        student.setSurname("Yıldız");
        student.setNumber(5678);
        student.setDevam(15);
        repo.save(student);
        
    }*/
    //Kullanıcı ekle
    @Test
    public void test() {
        User user = new User();
        user.setUsername("polat");
        user.setPassword("1234");
        user.setEnabled(true);
        repo.save(user);
        
    }
}
