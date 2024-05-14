package case1;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		analisarCandidato(2000.0, 1900.0);
		
		analisarCandidato(2000.0, 2000.0);

		analisarCandidato(1900.0, 2000.0);
	}

	static void analisarCandidato(double salarioBase, double salarioPretendido) {
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}

