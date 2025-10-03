public class Colaborador {
    int edv;
    String nome;
    String cargo;

    // Constructor Overload
    // Construtor padrão ou sem parâmetros
    public Colaborador() {
        System.out.println("Hello world!");
    }

    public Colaborador(int edv) {
        this.edv = edv;
        System.out.println(this.edv);
    }

    public Colaborador(int edv, String nome) {
        this.edv = edv;
        this.nome = nome;
        System.out.println(this.edv + " " + this.nome);
    }

    // Construtor com parâmetros
    public Colaborador(int edv, String nome, String cargo) {
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;

        System.out.println(this.edv + " " + this.nome + " " + this.cargo);
    }
}
