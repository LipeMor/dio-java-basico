package case4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE" };
         
        String[] candidatosSelecionados = selecaoCandidatos(candidatos);

        imprimirSelecionados(candidatosSelecionados);

        for (String candidato : candidatosSelecionados) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO: " +candidato);
        } while (continuarTentando && tentativasRealizadas <3 );

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "º REALIZADA");
        else    
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO DE TENTATIVAS " +tentativasRealizadas+ "º REALIZADAS");
    }

    static void imprimirSelecionados(String[] selecionados) {

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < selecionados.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + selecionados[indice]);
        }

        System.out.println("Imprimindo os candidatos sem informar o indice");

        for (String candidato : selecionados) {
            System.out.println("O candidato selecionado foi " + candidato);

        }

    }

    static String[] selecaoCandidatos(String[] candidatos) {
        String[] selecionados = {"","","","",""};

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

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
