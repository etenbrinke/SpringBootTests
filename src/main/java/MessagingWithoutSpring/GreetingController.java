package MessagingWithoutSpring;

/**
 * Created by etenbrinke on 08/12/15.
 */
public class GreetingController {

    public Greeting greeting(HelloMessage message) {
        //Thread.sleep(3000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
