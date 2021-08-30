package com.dongmingdi.springboot.controller;

import com.dongmingdi.springboot.dao.EmployeeDao;
import com.dongmingdi.springboot.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    EmployeeDao employeeDao = new EmployeeDao();

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }
}
