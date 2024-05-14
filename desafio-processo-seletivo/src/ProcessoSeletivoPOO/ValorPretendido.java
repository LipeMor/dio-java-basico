package ProcessoSeletivoPOO;

import java.util.concurrent.ThreadLocalRandom;

public class ValorPretendido {

    public static double definirValorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}
