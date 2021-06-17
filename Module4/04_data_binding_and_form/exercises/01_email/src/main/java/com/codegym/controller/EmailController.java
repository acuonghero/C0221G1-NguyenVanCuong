package com.codegym.controller;

import com.codegym.model.bean.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/email/")
public class EmailController {

    @RequestMapping(value = "showform", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        List<String> languageList = new ArrayList<>();
        languageList.add("VietNam");
        languageList.add("us");
        languageList.add("cn");
        languageList.add("l");
        List<String> pageSizeList = new ArrayList<>();
        pageSizeList.add("25");
        pageSizeList.add("26");
        pageSizeList.add("27");
        model.addAttribute("pageSize",pageSizeList);
        model.addAttribute("email", new Email());
        model.addAttribute("language",languageList);
        return "create";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
public String submit(@ModelAttribute("update") Email email, Model model) {
        model.addAttribute("email",email);
    return "info";
}
}