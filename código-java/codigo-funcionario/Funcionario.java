
// Class Funcionario
public class Funcionario {
    
    // Atributos
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario; 

    // Construtor
    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome; 
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;

    }

    // Método gets e sets:
 
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getEstado(){

        return
         "\nCódigo: " + codigo +
         "\nNome: " + nome +
         "\nCPF: " + cpf +
         "\nEndereço: " + endereco +
         "\nTelefone: " + telefone +
         "\nIdade: " + idade +
         "\nSalário: R$ " + String.format("%.2f", salario);

    }


    // Criação do segundo get estado - para mostra Salário Atualizado, deixando mais organizado e estruturado.
    public String getEstadoAtualizado() {
    return
        "\nCódigo: " + codigo +
        "\nNome: " + nome +
        "\nCPF: " + cpf +
        "\nEndereço: " + endereco +
        "\nTelefone: " + telefone +
        "\nIdade: " + idade +
        "\nSalário atualizado: R$ " + String.format("%.2f", salario);
}

    public float calculaSalarioLiquido(){
        return salario - (salario * 0.11f);
    }

    public String toString() {
        return getEstado();
    }

}
