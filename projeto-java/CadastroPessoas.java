import java.util.Scanner;

public class CadastroPessoas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] idades = new int[5];

        System.out.println("Sistema de Cadastro de Pessoas");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = input.nextLine();

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("\n Pessoas Cadastradas");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i]);
        }

        input.close();
    }
}
