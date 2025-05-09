
public class PrincipalFita {

    public static void main(String[] args) {

        FitaVideo fita1 = new FitaVideo("Ben 10", 10.00);
        FitaVideo fita2 = new FitaVideo("Homem Aranha", 15.00);
        FitaVideo fita3 = new FitaVideo("Vingadores: Ultimato", 20.00);

        System.out.println("Fitas Selecionadas:");

        System.out.println(fita1);
        System.out.println("Valor do aluguel por 3 dias: R$" + fita1.getValorAluguel(3));
        System.out.println();

        System.out.println(fita2);
        System.out.println("Valor do aluguel por 5 dias: R$" + fita2.getValorAluguel(5));
        System.out.println();

        System.out.println(fita3);
        System.out.println("Valor do aluguel por 10 dias: R$" + fita3.getValorAluguel(10));
    }
    
}

