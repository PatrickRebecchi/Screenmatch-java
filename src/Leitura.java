import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double mediaNota = 0;


        for (int i = 2; i < 5; i++) {
            System.out.println("Adc a sua nota: ");
            nota= sc.nextDouble();
            mediaNota += nota;        }

        System.out.printf("nota final: %.2f\n", mediaNota/3);


    }
}
