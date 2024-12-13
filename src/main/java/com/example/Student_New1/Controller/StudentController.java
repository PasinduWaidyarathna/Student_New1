package com.example.Student_New1.Controller;

import com.example.Student_New1.Model.Student;
import com.example.Student_New1.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Tag(name="StudentController",description="rdewg ewrg")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Create a new student
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    // Get all students
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudent();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // Get student by ID
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
        Student student = studentService.getStudentById(id);
        if (student == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // Update student
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(id, student);
        if (updatedStudent == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    // Delete student by ID
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Get students by year of enrollment
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @GetMapping("/year/{year}")
    public ResponseEntity<List<Student>> getStudentsByYear(@PathVariable int year) {
        List<Student> students = studentService.getStudentsByYearOfEnrollment(year);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // Get department by student ID
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @GetMapping("/department/{id}")
    public ResponseEntity<String> getDepartmentById(@PathVariable String id) {
        String department = studentService.getDepartmentByStudentId(id);
        if (department == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    // Delete students by year of enrollment
    @Operation(
            summary = "POST operation on students",
            description = "etg rert4h h54"
    )
    @DeleteMapping("/year/{year}")
    public ResponseEntity<Void> deleteStudentsByYear(@PathVariable int year) {
        studentService.deleteStudentsByYearOfEnrollment(year);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
