import java.util.ArrayList;

public class Departamento {
    String nome;
    double orcamento;
    int numeroFuncionarios;

    public Departamento(String nome, double orcamento, int numeroFuncionarios) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    void atualizarNome(String nome) {
        this.nome = nome;
    }

    void exibirDetalhes() {
        System.out.printf("O departamento de %s está com %d funcionários e um orçamento de R$%.2f\n", this.nome, this.numeroFuncionarios, this.orcamento);
    }

    double calcularAumentoDeOrcamento(double percentual) {
        return orcamento * (percentual / 100) + orcamento;
    }

    int obterNumeroDeFuncionarios() {
        return this.numeroFuncionarios;
    }

}
