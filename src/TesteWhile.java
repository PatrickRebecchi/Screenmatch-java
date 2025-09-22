import java.util.Scanner;

public class TesteWhile {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double nota = 0;
            double mediaNota = 0;
            int totalDeNota = 0;

            while(nota != -1){
                System.out.println("Digite sua avalicao para o filme ou -1 para encerrar");
                nota= sc.nextDouble();

                if (nota != -1){
                    mediaNota += nota;
                    totalDeNota++;
                }
            }
            System.out.printf("nota final: %.2f\n", mediaNota/totalDeNota);

        }
}


