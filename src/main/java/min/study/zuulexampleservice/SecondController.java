package min.study.zuulexampleservice;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
@Profile("second")
public class SecondController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome my second-service";
    }
}