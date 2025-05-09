
// Class Circulo
public class Circulo {
   
    // Atributos
    private int raio;

    // Contrutor
    public Circulo(int raio){
        this.raio = raio;
    }

    // Método
    // Calcular a Área 
    public double calcularArea(){
        return  3.141516 * raio * raio;
    }
        
    // Calcular Perímetro
    public double calcularPerimetro(){
        return 3.141516 * 2 * raio;
    }
        
    // Imprimir os dados 
    public void imprimir(){
    
        System.out.printf("Raio: %d, Área: %.2f, Perímetro: %.2f%n", raio, calcularArea(), calcularPerimetro());
            
    }

}
