public class Commisionado extends Funcionario {
    private double valorVendas;
    private int percentualComissao;

    public Commisionado(double valorVendas, int percentualComissao, String nome, String cpf) {
        super(nome, cpf);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(int percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    
    @Override
    public double calculaSalario() {
        return (this.valorVendas * this.percentualComissao) / 100;
    }

    @Override
    public String toString() {
        return "\nnome: " + super.getNome()
                + "\ncpf: " + super.getCpf()
                + "\nvalorVendas: " + this.valorVendas
                + "\npercentualComissao " + this.percentualComissao;
    }
}
