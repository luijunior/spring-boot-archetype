package $package;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerSimples {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}