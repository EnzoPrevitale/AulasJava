public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("ETS", 1000000, 450);
        System.out.println(departamento.nome);
        departamento.atualizarNome("ETC");
        System.out.println(departamento.nome);
        departamento.exibirDetalhes();
        System.out.println(departamento.calcularAumentoDeOrcamento(20));
        System.out.println(departamento.obterNumeroDeFuncionarios());
    }
}