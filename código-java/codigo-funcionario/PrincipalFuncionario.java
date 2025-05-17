
public class PrincipalFuncionario {
    
    public static void main(String[] args) {
        Funcionario fun = new Funcionario(
            137, "Matias", "543.192.067-20", "Rua da Serra", "(83) 98753-7584",19, 760.49f
        );

        System.out.println("Dados iniciais do Funcionario:");
        System.out.println(fun);
        fun.setSalario(1320.00f);

        System.out.println("\nDados finais do Funcionario atualizados:");
        System.out.println(fun.getEstadoAtualizado());
        System.out.printf("Salário líquido do Funcionario: R$ %.2f\n", fun.calculaSalarioLiquido());
    }

}


