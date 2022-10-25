package com.Himanshu.TTN.RestApi.Ques2.Controller;


import com.Himanshu.TTN.RestApi.Ques2.Service.EmpService;
import com.Himanshu.TTN.RestApi.Ques2.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
   private EmpService empService;
    @GetMapping(path = "/allEmp")
       public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee>list= empService.getAllEmployee();
        if (list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
        return ResponseEntity.of(Optional.of(list));


    }
//get employee by id
    @GetMapping("/Employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id){
        Employee employee =empService.getEmployee(id);
        if(employee==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(employee));
    }

//add employee
    @PostMapping("/Employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee e1 = null;
        try {

            e1 = this.empService.addEmployee(employee);
            System.out.println(employee);
            return ResponseEntity.of(Optional.of(e1));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
//control advice

    //delete employee by id
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Void> deleteEmp(@PathVariable("id") int id) {
        try {
            empService.deleteEmp(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
   //update Employee
    @PutMapping("/Employees/{id}")
    public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee,@PathVariable("id") int id){
        try {
            this.empService.updateEmp(employee,id);
            return ResponseEntity.ok().body(employee);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }


    }


    }



