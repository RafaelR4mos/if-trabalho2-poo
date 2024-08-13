import java.text.DecimalFormat;

public class Assalariado extends Funcionario {
    private double salario;

    public Assalariado(double salario, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");

        return "\nnome: " + super.getNome()
                + "\ncpf: " + super.getCpf()
                + "\nsalário: R$" + df.format(this.salario);
    }
}
