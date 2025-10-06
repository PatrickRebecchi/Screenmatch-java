package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;

import java.util.ArrayList;

/*public class br.com.alura.screenmatch.principal.Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970); // antes era meuFilme.anoDeLancamento = 1970;
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.printf("%.2f\n",meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2010);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2010);
        lost.setMinutosPorEpisodio(38);
        lost.setTemporadas(9);
        lost.setEpisodioPorTemporada(15);
        lost.exibeFichaTecnica();
        Filme meuFilme1 = new Filme("Super Man", 2021);
        //meuFilme1.setNome("Super Man");
        //meuFilme1.setAnoDeLancamento(2010); // antes era meuFilme.anoDeLancamento = 1970;
        meuFilme1.setDuracaoEmMinutos(150);

        CalculoraDeTempo c1 = new CalculoraDeTempo();
        System.out.println("***************************************");

        c1.inclui(meuFilme);
        c1.inclui(meuFilme1);
        c1.inclui(lost);
        System.out.println(c1.getTempoTotal());

        System.out.println("***************************************");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme1);


        System.out.println("***************************************");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(340);
        filtro.filtra(episodio);

        var filmePatrick = new Filme("Dogville", 2003);
        //filmePatrick.setNome("Dogville");
        //filmePatrick.setAnoDeLancamento(2003);
        filmePatrick.setDuracaoEmMinutos(200);
        filmePatrick.avalia(9);

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(filmePatrick);
        filmes.add(meuFilme1);
       filmes.add(meuFilme);

        //System.out.println("Total de fime assistindo " + filmes.size());
        //System.out.println("Primeiro filme " + filmes.get(0).getNome());
        //System.out.println("toString do " + filmes.get(0).toString());
        System.out.println(filmes);



    }
}*/

public  class Principal{
    public static void main(String[] args) {
        var filme01 = new Filme("Dogville", 2003);
        filme01.setDuracaoEmMinutos(180);

        filme01.avalia(8);
        filme01.avalia(5);
        filme01.avalia(10);
//        System.out.println(filme01.getSomaDasAvaliacoes());
//        System.out.println(filme01.getTotalDeAvaliacoes());
//        System.out.printf("%.2f\n",filme01.pegaMedia());
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme01);
        System.out.println("Total de fime assistindo " + filmes.size());
        System.out.println("Primeiro filme " + filmes.get(0).getNome());
        //System.out.println("toString do " + filmes.get(0).toString());

    }
}

