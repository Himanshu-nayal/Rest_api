package com.Himanshu.TTN.RestApi.Ques2.Service;

import com.Himanshu.TTN.RestApi.Ques2.entity.Employee;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpServiceImpl implements EmpService{
    List<Employee>emp=new ArrayList<>();
    public EmpServiceImpl(){
        emp.add(new Employee("Himanshu",101,22));
        emp.add(new Employee("aman",102,23));
        emp.add(new Employee("amit",104,24));
        emp.add(new Employee("john",106,25));
        emp.add(new Employee("adam",105,26));
    }
    @Override
    public List<Employee> getAllEmployee() {
        return emp;
    }

    @Override
    public Employee getEmployee(int id) {
        Employee em=null;
        try {
            for (Employee e1 : emp) {
                if (e1.getId() == id) {
                    em = e1;
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return em;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        emp.add(employee);
        return employee;
    }

    @Override
    public void deleteEmp(int id) {
        emp=emp.stream().filter(employee -> employee.getId()!=id).collect(Collectors.toList());

    }
    @Override
    public void updateEmp(Employee employee, int id) {
        emp=emp.stream().map(e -> {
            if (e.getId()==id){
                e.setAge(employee.getAge());
                e.setName(employee.getName());
            }
            return e;
        }).collect(Collectors.toList());

    }

}
