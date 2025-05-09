
public class PrincipalFuncionario {
    
    public static void main(String[] args) {
        Funcionario f = new Funcionario(
            007, "Matias", "543.192.067-20", "Rua da Serra", "(83) 98753-7584",19, 760.49f
        );

        System.out.println("Dados do Funcionario:");
        System.out.println(f);
        f.setSalario(1515.00f);
        System.out.println("\nDados do Funcionario atualizados:");
        System.out.println(f);
        System.out.printf("Salário líquido do Funcionario: R$ %.2f\n", f.calculaSalarioLiquido());
    }

}


