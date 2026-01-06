package br.com.alura.screenmatch.principal;


import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.service.ScrenmatchApiService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ScrenmatchApiService service = new ScrenmatchApiService();
        List<Titulo> titulos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o filme (ou 'sair' para encerrar): ");
            String busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Titulo titulo = service.buscarTitulo(busca);
                titulos.add(titulo);
                System.out.println("✔ Filme encontrado:");
                System.out.println(titulo);

            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println("Erro ao converter o ano: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Filme não encontrado ou busca inválida.");

            } catch (IOException | InterruptedException e) {
                System.out.println("Erro de comunicação com a API.");

            }
        }

        System.out.println("\nFilmes buscados:");
        System.out.println(titulos);
        System.out.println("Programa finalizado.");
    }
}

