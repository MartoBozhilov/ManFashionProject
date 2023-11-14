package com.manfashion.manfashion.controller;

import com.manfashion.manfashion.model.dto.UserRegistrationDTO;
import com.manfashion.manfashion.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/login")
    public String login() {
        return "login";
    }

    @GetMapping("/users/register")
    public String register(@ModelAttribute("userRegistrationDTO")
                           UserRegistrationDTO userRegistrationDTO) {

        return "user-register";
    }

    @ModelAttribute("userModel")
    public UserRegistrationDTO initUserModel() {
        return new UserRegistrationDTO();
    }

    @PostMapping("/users/register")
    public String register(@Valid UserRegistrationDTO userModel,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userModel", userModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userModel", bindingResult);
            return "redirect:/users/register";
        }

        userService.register(userModel);

        return "redirect:/";
    }

}
