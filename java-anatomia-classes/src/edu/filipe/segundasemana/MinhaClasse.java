package edu.filipe.segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Filipe";
        String segundoNome = "Moreira dos Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
