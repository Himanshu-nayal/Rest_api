package com.Himanshu.TTN.RestApi.Ques2.Exception;


import com.Himanshu.TTN.RestApi.Ques2.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends RuntimeException{
    public EmployeeNotFound(String message){
        super(message);
    }

}
