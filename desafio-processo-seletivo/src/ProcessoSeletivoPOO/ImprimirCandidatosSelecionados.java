package ProcessoSeletivoPOO;

public class ImprimirCandidatosSelecionados {

    public static void imprimirSelecionados(String[] selecionados) {

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < selecionados.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + selecionados[indice]);
        }

        System.out.println("Imprimindo os candidatos sem informar o indice");

        for (String candidato : selecionados) {
            System.out.println("O candidato selecionado foi " + candidato);

        }

    }

}
