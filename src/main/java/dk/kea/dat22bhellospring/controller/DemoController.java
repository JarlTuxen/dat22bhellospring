package dk.kea.dat22bhellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hejdat22b")
    public String helloDat22b(){
        return "Hej Dat22b!<br>Tid for en øvelse!";
    }

    @GetMapping("/parameter")
    public String parameterTest(@RequestParam String input){
        return input;
    }

}
