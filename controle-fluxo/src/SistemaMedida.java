public class SistemaMedida {

    public static void main(String[] args) {

        String sigla = "M"; // P / M / G

        /* if(sigla == "P") EXEMPLO USANDO IF
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO"); */

        switch (sigla) { //EXEMPLO USANDO SWITCH/CASE
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
			System.out.println("INDEFINIDO");
        }

    }

}