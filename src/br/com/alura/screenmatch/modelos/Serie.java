package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodioPorTemporada;
    private  int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }
    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome do Serie: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("total de minutos: "+ getDuracaoEmMinutos());
    }

    @Override
    public String toString() {
        return "Serie: " + getNome() + " ("+ getAnoDeLancamento() +")";
    }

}
