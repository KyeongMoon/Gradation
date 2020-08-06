package org.team15.gradation.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/home")
    public String main(){
        return "index";
    }
}
