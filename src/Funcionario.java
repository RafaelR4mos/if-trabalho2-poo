public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    public double calculaSalario() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "\ncpf: " + this.cpf + "\n----------------";
    }
}
