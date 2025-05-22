public class Professor {
    // Atributos
    private int matricula;
    private String nomeProfessor;
    private String nomeDepartamento;

    // Construtor
    public Professor(int matricula, String nomeProfessor, String nomeDepartamento){
        this.matricula = matricula;
        this.nomeProfessor = nomeProfessor;
        this.nomeDepartamento = nomeDepartamento;
    }

    // Metodos
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula( int matricula){
        this.matricula = matricula;
    }

    public String getNomeprofessor(){
        return nomeProfessor;
    }

    public void setNomeProfessor( String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeDepartamento(){
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento){
        this.nomeDepartamento = nomeDepartamento;
    }

    // imprimir 
    public void imprimir(){
      System.out.println("====== Dados do Professor =======");  
      System.out.println("Matricula: " + matricula);
      System.out.println("Nome do Professor: " + nomeProfessor);
      System.out.println("Nome do Departamento: " + nomeDepartamento);
        
    }

}
