public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, double horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calculaSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }

    @Override
    public String toString() {
        return "\nnome: " + super.getNome()
                + "\ncpf: " + super.getCpf()
                + "\nvalorHora: "  + this.valorHora
                + "horasTrabalhadas: " + this.horasTrabalhadas;
    }
}
