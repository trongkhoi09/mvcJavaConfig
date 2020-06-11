package com.spring.controllers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
//    @ResponseBody
    public String handleException (Model model, Exception ex) {
//        return "from @ExceptionHandler method: " + ex ;
        model.addAttribute("message",ex);
        return "error";
    }
}
