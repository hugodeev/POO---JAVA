
// Classe Pessoa 
public class Pessoa{
    
    // Atributos
    // Private: ele define que só a classe pessoa vai poder acessar: nome e idade.
    private String nome; 
    private int idade;
    
    // Construtor
    // Adiciona objetos novos a classe.
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    // é uma proprieda de ação ou comportamento do objeto.
    public void falar(){

        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos!!");

    }
    
}
