
// Classe  Quadrado
public class Quadrado {
    
   // Atributos
    private int lado;

    // Construtor
    public Quadrado (int lado){
        this.lado = lado;
    }

    // Método
    // Calcular a Área 
    public int calcularArea(){
        return lado * lado;
    }
    
    // Calcular Perímetro
    public int calcularPerimetro(){
        return 4 * lado;
    }
    
    // Imprimir os dados 
    public void imprimir(){

        System.out.printf("Lado: %d \nÁrea: %d \nPerímetro: %d\n", lado, calcularArea(), calcularPerimetro());
        
    }
    
}
