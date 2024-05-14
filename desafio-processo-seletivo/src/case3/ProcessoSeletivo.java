package case3;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        selecaoCandidatos();

        imprimirSelecionados();

    }

    static void imprimirSelecionados() {
        String[] candidatosSelecionados = selecaoCandidatos();

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatosSelecionados.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatosSelecionados[indice]);
        }

        System.out.println("Imprimindo os candidatos sem informar o indice");

        for (String candidato : candidatosSelecionados) {
            System.out.println("O candidato selecionado foi " + candidato);

        }

    }

    static String[] selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };
        String[] selecionados = { "", "", "", "", "" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        int i = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

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

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
