package com.example.backend.Controller;


import com.example.backend.DTO.dataForLogin;
import com.example.backend.Entity.Employees;
import com.example.backend.Repository.AdminRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminRepo adminRepo;

    @PostMapping("/login")
    private String loginAdmin(@RequestBody dataForLogin dataforlogin)
    {
        Employees employees = adminRepo.loginemployee(dataforlogin.email);
        //System.out.println(dataforlogin.email);
        if(employees == null)
        {
            return "Unauthorized";
        }
        else {
            if(employees.getPassword().equals(dataforlogin.password) )
            {
                return "Success";
            }
            else {
                return "IncorrectPassword";
            }
        }


    }

}
