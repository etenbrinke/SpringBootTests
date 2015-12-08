package MessagingWithoutSpring;

/**
 * Created by etenbrinke on 08/12/15.
 */
public class Tester {

    public static void main(String[] args) {

        // create object for message
        HelloMessage m1 = new HelloMessage("Ep");

        // create object for Greeting Controller
        GreetingController gc1 = new GreetingController();

        // create object for Greeting
        Greeting g1 = gc1.greeting(m1);

        System.out.println(g1.getContent());

    }

}
