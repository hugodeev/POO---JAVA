
public class PrincipalFita {

    public static void main(String[] args) {

        FitaVideo fita1 = new FitaVideo("Ben 10", 5.00);
        FitaVideo fita2 = new FitaVideo("Homem Aranha", 10.00);
        FitaVideo fita3 = new FitaVideo("Vingadores: Ultimato", 15.00);

        System.out.println("\nFitas Selecionadas Pelo o Usuario:");
        System.out.println(fita1);
        System.out.println("Valor do aluguel por 2 dias: R$" + fita1.getValorAluguel(2));
        System.out.println("--------------------------------");

        System.out.println(fita2);
        System.out.println("Valor do aluguel por 4 dias: R$" + fita2.getValorAluguel(4));
        System.out.println("--------------------------------");

        System.out.println(fita3);
        System.out.println("Valor do aluguel por 6 dias: R$" + fita3.getValorAluguel(6));
    }
    
}

