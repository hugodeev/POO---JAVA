
// Classe Carro
public class Carro{
    
    // Atributos
    private String fabricante;
    private String modelo;
    private int ano;
    private float velocidade;
    
    // Construtor
    public Carro (String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    // Método
    public  String getFabricante(){
        return fabricante;
    }

    public  void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public  String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public  int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public float getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

// Acelerar e Frear

    public void acelerar(){
        if (velocidade < 110)
        velocidade  = velocidade += 10;
    }

    public void frear(){
        if (velocidade > 0)
        velocidade -= 10;
    }

}
