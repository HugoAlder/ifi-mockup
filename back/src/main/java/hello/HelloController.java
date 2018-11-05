package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloController {
    
    @CrossOrigin(origins = "http://localhost")
    @RequestMapping("/api/hello")
    public Hello hello() {
        return new Hello("World");
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping("/api/environment")
    public Hello env() {
    	return new Hello(System.getenv("ENV"));
    }
}
