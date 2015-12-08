package MyFirstService;

import org.springframework.stereotype.Service;

/**
 * Created by etenbrinke on 07/12/15.
 */
@Service
public class TestService {

    public String call() {
        return "Greetings from Spring Boot!";
    }

    public String callAgain() {
        return "Greetings again from Spring Boot!";
    }

}
