import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Funcionario> funcionarios;

    public Loja() {
        this.funcionarios = new ArrayList<>();
    }

    public void cadastrarAssalariado(Assalariado novoAssalariado) {
        funcionarios.add(novoAssalariado);
    }

    public void cadastrarHorista(Horista novoHorista) {
        funcionarios.add(novoHorista);
    }

    public void cadastrarComissionado(Commisionado novoComissionado) {
        funcionarios.add(novoComissionado);
    }

    public List<Funcionario> listarTodosFuncionarios() {
        return funcionarios;
    }

    public List<Assalariado> listarAssalariados() {
        List<Assalariado> assalariados = new ArrayList<>();

        for(Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Assalariado) {
                Assalariado assalariado = (Assalariado) funcionario;
                assalariados.add(assalariado);
            }
        }

        return assalariados;
    }

    public List<Horista> listarHoristas() {
        List<Horista> horistas = new ArrayList<>();

        for(Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Horista) {
                Horista horista = (Horista) funcionario;
                horistas.add(horista);
            }
        }

        return horistas;
    }

    public List<Commisionado> listarComissionados() {
        List<Commisionado> comissionados = new ArrayList<>();

        for(Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Commisionado) {
                Commisionado commisionado = (Commisionado) funcionario;
                comissionados.add(commisionado);
            }
        }

        return comissionados;
    }
}
