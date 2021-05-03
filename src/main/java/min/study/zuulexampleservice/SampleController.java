package min.study.zuulexampleservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome my " + serviceName;
    }
}
