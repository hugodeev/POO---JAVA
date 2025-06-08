public class PrincipalPorta {
    
    public static void main(String[] args) {
        Porta porta01 = new Porta("Azul", 30, 15, true);
        Porta porta02 = new Porta("Branco", 40, 25, false);
        System.out.println("\nPortas True e False:");
        System.out.print("\nPrimeira Porta:");
        System.out.println(porta01.toString());
        System.out.print("\nSegunda Porta:");
        System.out.println(porta02.toString());
        System.out.println("Programa Finalizado!");
    }

}