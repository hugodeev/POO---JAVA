
public class FitaVideo {
    
    // Atributos
    private String titulo;
    private double precoPorDia;

    // Construtor
    public FitaVideo(String titulo, double precoPorDia) {
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;
    }

    // Métodos 
    public String getTitulo() {
        return titulo;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public double getValorAluguel(int numDiasAlugada) {
        return precoPorDia * numDiasAlugada;
    }

    public String toString() {
        return "Título da Fita: " + titulo + ", Preço por dia Da Fita: R$" + String.format("%.2f", precoPorDia);
    }
}
