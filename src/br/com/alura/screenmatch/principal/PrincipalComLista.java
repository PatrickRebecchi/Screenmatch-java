package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.io.File;
import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        Filme filme2 = new Filme("Avatar", 2023);
        Filme filme3 = new Filme("Dogville", 2003);
        Serie lost = new Serie ("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item);
        }
        
        //System.out.println(lista.size());

    }
}
