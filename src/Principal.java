import br.com.alura.screenmatch.calculos.CalculoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970); // antes era meuFilme.anoDeLancamento = 1970;
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.printf("%.2f\n",meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2010);
        lost.setMinutosPorEpisodio(38);
        lost.setTemporadas(9);
        lost.setEpisodioPorTemporada(15);
        lost.exibeFichaTecnica();
        Filme meuFilme1 = new Filme();
        meuFilme1.setNome("O poderoso chefão");
        meuFilme1.setAnoDeLancamento(1970); // antes era meuFilme.anoDeLancamento = 1970;
        meuFilme1.setDuracaoEmMinutos(150);

        CalculoraDeTempo c1 = new CalculoraDeTempo();

        c1.inclui(meuFilme);
        c1.inclui(meuFilme1);
        c1.inclui(lost);
        System.out.println(c1.getTempoTotal());



    }
}