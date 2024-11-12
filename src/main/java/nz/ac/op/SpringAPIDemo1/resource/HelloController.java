package nz.ac.op.SpringAPIDemo1.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to Spring boot REST API";
    }
    @GetMapping("/abc")
    public String sayABC(){
        return "This is ABC ";
    }
}
