package com.spring.controllers;

import com.spring.model.Person;

import com.spring.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@Controller
//@SessionAttributes(types = PersonController.class)
public class PersonController {

    @Autowired
    PersonServices personServices;

    @RequestMapping(value = "person", method = RequestMethod.POST)
    public String person(Model model, @ModelAttribute("person") @Valid Person person,
                         BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "home";
        } else {
            model.addAttribute("message", person);
            return "person";
        }
    }

    @RequestMapping(value = "all-person", method = RequestMethod.GET)
    public String getAllPerson(Model model) {
        List<Person> list = personServices.getAllPerson();
        model.addAttribute("list", list);
        return "all-person";
    }


    @RequestMapping(value = "person-detail/{id}", method = RequestMethod.GET)
    public String personDetail(Model model, @PathVariable(name = "id") int id) {
        model.addAttribute("person", personServices.getPersonById(id));
        return "person-detail";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addPerson(Model model) {
        model.addAttribute("person", new Person());
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add";
        }
        personServices.addPerson(person);
        return "redirect:/all-person";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deletePerson(@PathVariable(name = "id") int id) {
        personServices.deletePerson(id);
        return "redirect:/all-person";
    }


    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String editPerson(Model model, @PathVariable(name = "id") int id) {
        model.addAttribute("person", personServices.getPersonById(id));
        return "edit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String editPerson(@ModelAttribute("person") Person person, BindingResult result) {
        if(person.getName().length()==0){
            result.rejectValue("name","person", "name empty");
            return "edit";
        }if(person.getLocation().length()==0){
            result.rejectValue("location","person", "location empty");
            return "edit";
        }
        if(person.getName().matches("[0-9]")){
            result.rejectValue("name","person","invalid name");
            return "edit";
        }
        personServices.updatePerson(person);
        return "redirect:/all-person";
    }
//  Valid form
    @RequestMapping(value = "valid")
    public String valid(Model model){
        model.addAttribute("person", new Person());
        return "valid";
    }

    @RequestMapping(value = "success", method = RequestMethod.POST)
    public String success(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "valid";
        }return "success";
    }

    @RequestMapping(value = "param/{id}")
    public String param(@PathVariable("id") String id, @RequestParam(value="name") String name, Model model){
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "success";
    }

}
