package ProcessoSeletivoPOO;

import java.util.Random;

public class Atender {

    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

}
