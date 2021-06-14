package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Calculate {
    @GetMapping
    public String show(){
        return "show";
    }
    @PostMapping("/calculate")
    public String result(@RequestParam int usd, Model model){
        int result = usd*23000;
        model.addAttribute("result",result);
        return "show";
    }
}
