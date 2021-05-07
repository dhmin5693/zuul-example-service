package min.study.zuulexampleservice;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
@Profile("first")
public class FirstController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome my first-service";
    }
}
