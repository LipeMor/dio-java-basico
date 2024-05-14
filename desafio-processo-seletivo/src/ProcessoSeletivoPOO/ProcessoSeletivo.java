package ProcessoSeletivoPOO;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE" };
         
        String[] candidatosSelecionados = SelecaoCandidatos.selecionarCandidatos(candidatos);

        ImprimirCandidatosSelecionados.imprimirSelecionados(candidatosSelecionados);

        for (String candidato : candidatosSelecionados) {
            EntrandoEmContato.entrarEmContatoComCandidato(candidato);
        } 
    }
}
