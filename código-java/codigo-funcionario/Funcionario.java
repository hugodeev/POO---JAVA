
// Class Funcionario
public class Funcionario {
    
    // Atributos
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario; 

    // Construtor
    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, double salario){
        this.codigo = codigo;
        this.nome = nome; 
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;

    }

    // Método
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEstado() {

        return "Código: " + codigo + 
               ", Nome: " + nome +
               ", CPF: " + cpf +
               ", Endereço: " + endereco +
               ", Telefone: " + telefone +
               ", Idade: " + idade + 
               ", Salário: R$ " + String.format("%.2f", salario);

    }

    public double calculaSalarioLiquido() {
        return salario * 0.89f; 
    }

    public String toString() {
        return getEstado();
    }

}
