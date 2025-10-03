import java.util.Map;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] grausInstrucao = {"Ensino Médio", "Ensino Técnico", "Ensino Superior"};

        String nome;
        String sobrenome;
        String dataNascimento;
        float pretensaoSalarial;
        String grauInstrucao;
        String cargoPretendido;
        boolean possuiCnhTipoB;


        System.out.println("Cadastro para vaga de emprego");
        System.out.print("Digite o seu primeiro nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.print("Digite a sua data de nascimento: ");
        dataNascimento = scanner.nextLine();
        System.out.print("Digite a sua pretensão salarial: ");
        pretensaoSalarial = scanner.nextFloat();
        System.out.println("Escolha o seu grau de instrução: ");
        for(int i = 0; i < grausInstrucao.length; i++) {
            System.out.printf("[%d] - %s\n", i+1 , grausInstrucao[i]);
        }
        grauInstrucao = grausInstrucao[scanner.nextInt() - 1];
        System.out.print("Digite o nome do cargo pretendido: ");
        scanner.nextLine(); // Limpando
        cargoPretendido = scanner.nextLine();
        System.out.print("Você possui CNH tipo B? (Sim ou Não): ");
        possuiCnhTipoB = scanner.nextLine().equals("Sim");

        scanner.close();

        System.out.println("Confirmar cadastro:");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Pretensão salarial: " + pretensaoSalarial);
        System.out.println("Grau de instrução: " + grauInstrucao);
        System.out.println("Cargo pretendido: " + cargoPretendido);
        if(possuiCnhTipoB) System.out.println("CNH tipo B: Sim");
        else System.out.println("CNH tipo B: Não");
    }
}