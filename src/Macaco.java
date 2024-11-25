import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Macaco {

    private String nome;
    private List<String> bucho;
    private Scanner sc;

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public void comer() {
        System.out.println(nome + ", quantos alimentos você quer comer? (máximo 3)");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            if (bucho.size() < 3) {
                System.out.println("Digite o nome do alimento " + (i + 1) + ":");
                String alimento = sc.next();
                
                // Verifica se o alimento não é o nome do próprio macaco
                if (alimento.equalsIgnoreCase(nome)) {
                    System.out.println(nome + " não pode comer a si mesmo!");
                } else {
                    bucho.add(alimento);
                    System.out.println(nome + " comeu " + alimento + ".");
                }
            } else {
                System.out.println(nome + " não aguenta mais comer!");
                break;
            }
        }
    }

    public void verBucho() {
        if (bucho.isEmpty()) {
            System.out.println(nome + " está com o bucho vazio.");
        } else {
            System.out.println(nome + " tem no bucho: " + String.join(", ", bucho) + ".");
        }
    }

    public void digerir() {
        if (!bucho.isEmpty()) {
            System.out.println(nome + " está digerindo os alimentos.");
            bucho.clear();
            System.out.println("O bucho de " + nome + " agora está vazio.");
        } else {
            System.out.println(nome + " não tem nada para digerir.");
        }
    }

    public String getNome() {
        return nome;
    }
}