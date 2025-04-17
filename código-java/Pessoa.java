// Classe
public class Pessoa{
    
    // Atributos
    // Private: ele define que só a classe pessoa vai poder acessar: nome e string.
    private String nome; 
    private int idade;
    

    // Construtor
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    public void falar(){

        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos!!");

    }
}
