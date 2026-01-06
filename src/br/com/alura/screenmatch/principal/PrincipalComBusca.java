package br.com.alura.screenmatch.principal;


import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.service.ScrenmatchApiService;
import java.io.IOException;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ScrenmatchApiService service = new ScrenmatchApiService();

        System.out.println("Digite o filme para busca: ");
        String busca = leitura.nextLine();

        System.out.println("Resultado final:");
        System.out.println(busca);


    }

}

