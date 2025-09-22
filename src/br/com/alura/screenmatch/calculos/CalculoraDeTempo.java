package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculoraDeTempo {
    private int tempoTotal = 0;


    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo){
        System.out.println("Adc duracao em minutos de " + titulo);
        this.tempoTotal +=titulo.getDuracaoEmMinutos();
    }

}
