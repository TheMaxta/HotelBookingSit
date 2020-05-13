package bookingdemo.bookingdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/HOME")
    public String welcome(){
        return "Welcome to my first ever Spring App! ";
    }
}
