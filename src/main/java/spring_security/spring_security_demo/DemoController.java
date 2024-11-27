package spring_security.spring_security_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping
    public String getDemo(){

        return ("<h1>Spring security test demo sucessfull</h2>");
    }
}
//username-user
//password-029ef4fb-36fa-486e-b5c7-b1c454180eea