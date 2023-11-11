package com.manfashion.manfashion.controller;

import com.manfashion.manfashion.model.entity.UserRole;
import com.manfashion.manfashion.repository.RoleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {

    private final RoleRepository roleRepo;

    public TestController(RoleRepository roleRepo) {
        this.roleRepo = roleRepo;
    }

    @GetMapping("/")
    public String service() {

        List<UserRole> roles = roleRepo.findAll();

        return "index";
    }

}
