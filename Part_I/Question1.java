package Part_I;

import java.util.Random;

public class Question1 {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15) {
            return Answers.MAYBE; // 15%
        } else if (prob < 30) {
            return Answers.NO; // 15%
        } else if (prob < 60) {
            return Answers.YES; // 30%
        }
        else if (prob < 75) {
            return Answers.LATER; // 15%
        }
        else if (prob < 98) {
            return Answers.SOON; // 13%
        }
        else {
            return Answers.NEVER; // 2%
        }
    }
}
