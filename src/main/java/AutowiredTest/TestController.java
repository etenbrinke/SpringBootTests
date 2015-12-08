package AutowiredTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by etenbrinke on 08/12/15.
 */
@RestController
public class TestController {

    @Autowired
    TestService service;

    public String index() {
        return service.call();
    }

}
