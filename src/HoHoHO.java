public class HoHoHO {
    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BROWN = "\u001B[33m";

        int altura = 20;


        for (int i = 1; i <= altura; i++) {


            for (int espacos = 1; espacos <= altura - i; espacos++) {
                System.out.print(" ");
            }


            for (int asteriscos = 1; asteriscos <= (2 * i - 1); asteriscos++) {
                System.out.print(ANSI_GREEN + "*" + ANSI_RESET);
            }

            System.out.println();
        }


        int larguraBase = 3;
        int alturaBase = 3;
        int espacosBase = (2 * altura - 1 - larguraBase) / 2;

        for (int i = 0; i < alturaBase; i++) {


            for (int espacos = 0; espacos < espacosBase; espacos++) {
                System.out.print(" ");
            }


            for (int base = 0; base < larguraBase; base++) {
                System.out.print(ANSI_BROWN + "|" + ANSI_RESET);
            }

            System.out.println();
        }


        String mensagem = "Feliz Natal";
        int larguraArvore = 2 * altura - 1;
        int espacosMensagem = (larguraArvore - mensagem.length()) / 2;
        for (int i = 0; i < espacosMensagem; i++) {
            System.out.print(" ");
        }
        System.out.println(ANSI_RED + mensagem + ANSI_RESET);
    }
}