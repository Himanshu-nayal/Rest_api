package com.Himanshu.TTN.RestApi.Ques2.Service;


import com.Himanshu.TTN.RestApi.Ques2.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface EmpService {
    List<Employee> getAllEmployee();


   public Employee getEmployee(int id);
   public Employee addEmployee(Employee employee);

   public void deleteEmp(int id);

   public void updateEmp(Employee employee, int id);
}
