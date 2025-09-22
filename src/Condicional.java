public class Condicional {
    public static void main(String[] args) {
        boolean incluidoNoPlano = false;
        double notaDoFilme= 8.1;
        String tipoPlano= "plus";
        int anoDeLancamento = 2022;

        if (anoDeLancamento >= 2022){
            System.out.println("Lancamento que os clientes estão curtindo");
        }else {
            System.out.println("Filme retrõ que vale a pena assistir!");
        }


        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
