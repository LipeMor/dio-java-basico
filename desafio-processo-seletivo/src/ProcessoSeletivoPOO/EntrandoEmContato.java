package ProcessoSeletivoPOO;

public class EntrandoEmContato {

    public static void entrarEmContatoComCandidato(String candidato) {
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = Atender.atender();
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

}
