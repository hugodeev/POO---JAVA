
public class PrincipalCarro {
    
    public static void main(String args[]) {

       Carro c = new Carro( "Fiat", "UNO", 2000);
       System.out.println("Carro Criado:");
       System.out.println("Fabricante:" + c.getFabricante());
       System.out.println("Modelo:" + c.getModelo());
       System.out.println("Ano:" + c.getAno());
       System.out.println("Velocidade:" + c.getVelocidade() + "Km/h");
       
    } 
    
}
