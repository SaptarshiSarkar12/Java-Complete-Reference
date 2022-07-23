package Part_I;
import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30)
            return NO; // 30%
        else if (prob < 60)
            return YES; // 30%
        else if (prob < 75)
            return LATER; // 15%
        else if (prob < 98)
            return SOON; // 13%
        else
            return NEVER; // 2%
    }
}
