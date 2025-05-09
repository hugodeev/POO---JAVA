
// Class Retângulo
public class Retangulo{

    // Atributos
    private int comprimento;
    private int largura;

    // Contrutor
    public Retangulo ( int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Método
    // Calcular a Área 
    public int calcularArea(){
        return comprimento * largura;
    }
    
    // Calcular Perímetro
    public int calcularPerimetro(){
        return 2 * comprimento + 2 * largura;
    }
    
    // Imprimir os dados 
    public void imprimir(){

        System.out.printf("Comprimento: %d, Largura: %d, Perímetro: %d\n", comprimento, largura, calcularArea(), calcularPerimetro());
        
    }

}