
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

    // Calcular o valor total do aluguel
    public double getValorAluguel(int numeroDeDiasAlugada) {
        return precoPorDia * numeroDeDiasAlugada;
    }

    // Converter para textual ou caracteres
    public String toString() {
        return "Título: " + titulo + ", Preço por dia: R$" + String.format("%.2f", precoPorDia);
    }
}
