package ProcessoSeletivoPOO;

public class SelecaoCandidatos {

    public static String[] selecionarCandidatos(String[] candidatos) {
        String[] selecionados = {"","","","",""};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        int i = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = ValorPretendido.definirValorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                selecionados[i] = candidato;
                i++;
            }
            candidatoAtual++;
        }
        return selecionados;
    }

}
