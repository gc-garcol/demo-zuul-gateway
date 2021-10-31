package gc.garcol.archive.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author garcol
 */
@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "hello world";
    }

}
