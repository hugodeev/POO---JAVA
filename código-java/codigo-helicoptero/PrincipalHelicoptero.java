
public class PrincipalHelicoptero {

    public static void main(String[] args) {
        Helicoptero h1 = new Helicoptero(4);
        Helicoptero h2 = new Helicoptero(1);

        // Dados do Helicóptero inicial
        System.out.println("=== ESTADO INICIAL DOS HELICÓPTEROS ===");
        System.out.println("Helicóptero 1: " + h1);
        System.out.println("Helicóptero 2: " + h2);

        // Comando Entra 
        System.out.println("\n=== ENTRADA DE PESSOAS ===");
        System.out.println("1 pessoa entrou no Helicóptero 1, que tem a capacidade igual a 4.");
        h1.entra();
        System.out.println("\n1 pessoa entrou no Helicóptero 2, que tem a capacidade igual a 1.");
        h2.entra();

        // Comando Liga
        System.out.println("\n=== LIGANDO OS HELICÓPTEROS ===");
        h1.ligar();
        h2.ligar();
        System.out.println("Helicópteros ligados.");

        // Comando Decolar
        System.out.println("\n=== DECOLANDO ===");
        h1.decolar(1000);
        h2.decolar(800);
        System.out.println("Helicóptero 1 decolou para 1000 metros.");
        System.out.println("Helicóptero 2 decolou para 800 metros.");

        System.out.println("\n=== ESTADO APÓS DECOLAGEM ===");
        System.out.println("Helicóptero 1: " + h1);
        System.out.println("Helicóptero 2: " + h2);

        // Comando Aterrissar
        System.out.println("\n=== ATERRISSANDO ===");
        h1.aterrissar();
        h2.aterrissar();
        System.out.println("Ambos os helicópteros aterrissaram.");

        // Comando Desligar
        System.out.println("\n=== DESLIGANDO OS HELICÓPTEROS ===");
        h1.desligar();
        h2.desligar();
        System.out.println("Helicópteros desligados.");

        // Comando Sai
        System.out.println("\n=== SAÍDA DE PESSOAS ===");
        h1.sai();
        h2.sai();
        System.out.println("1 pessoa saiu de cada helicóptero.");

        System.out.println("\n=== ESTADO FINAL DOS HELICÓPTEROS ===");
        System.out.println("Helicóptero 1: " + h1);
        System.out.println("Helicóptero 2: " + h2);
    }
}
