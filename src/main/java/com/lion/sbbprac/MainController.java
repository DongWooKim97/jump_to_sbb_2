package com.lion.sbbprac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "welcome to sbb";
    }

    @GetMapping("/home")
    public String home(){

        return "home";
    }


    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
