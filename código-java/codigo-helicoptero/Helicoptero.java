
public class Helicoptero {

    // Atributos
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int pessoas;

    // Construtor: Está Criando Um Novo Objeto A Nossa Class
    public Helicoptero(int capacidade) {
        this.capacidade = capacidade;
        this.ligado = false;
        this.altitude = 0;
        this.pessoas = 0;
    }

    // Métodos

    // Comando Entra:  (só deve acrescentar se ainda houver espaço)
    public void entra() {
        if (pessoas < capacidade) {
            pessoas++;
        } else {
            System.out.println("Capacidade do helicóptero está cheia.");
        }
    }

    // Comando Sai: (só deve remover se houver alguém dentro dele)
    public void sai() {
        if (pessoas > 0) {
            pessoas--;
        } else {
            System.out.println("Nenhuma pessoa no nosso helicóptero.");
        }
    }

    // Comando Liga: (Só deve ligar se o helicóptero estiver desligado).
    public void ligar() {
        if (!ligado) {
            ligado = true;
        } else {
            System.out.println("Helicóptero já está ligado.");
        }
    }

    // Comando Decolar: (só deve decolar se estiver ligado e se a altitude for igual a zero).
    public void decolar(int novaAltitude) {
        if (ligado && altitude == 0) {
            altitude = novaAltitude;
        } else {
            System.out.println("Impossível decolar o nosso helicóptero.");
        }
    }

    // Comando Aterrissar: (só deve aterrissar se estiver ligado e se a altitude for maior que zero); 
    public void aterrissar() {
        if (ligado && altitude > 0) {
            altitude = 0;
        } else {
            System.out.println("Impossível aterrissar o nosso helicóptero.");
        }
    }

    // Comando DesLiga: (Só deve desligar se o helicóptero estiver ligado e  se a altitude for igual a zero).
    public void desligar() {
        if (ligado && altitude == 0) {
            ligado = false;
        } else {
            System.out.println("Impossível desligar o nosso helicóptero.");
        }
    }

    // Getters e Setters
    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    // Método toString
    public String toString() {
        return "Helicóptero {" +
                "ligado=" + ligado +
                ", altitude=" + altitude +
                ", capacidade=" + capacidade +
                ", pessoas=" + pessoas +
                '}';
    }

}