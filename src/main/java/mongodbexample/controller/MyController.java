package mongodbexample.controller;

import mongodbexample.models.Student;
import mongodbexample.repo.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {

    @Autowired
    private IStudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student student1 = this.studentRepository.save(student);
        return ResponseEntity.ok(student1);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudents(){
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
