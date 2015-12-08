package AutowiredTest;

import org.springframework.stereotype.Service;

/**
 * Created by etenbrinke on 08/12/15.
 */
@Service
public class TestService {

    public String call() {
        return "Greetings from Spring Boot!";
    }

}
