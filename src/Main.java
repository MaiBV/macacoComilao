import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do macaco:");
        String nomeMacaco = sc.nextLine();
        
        Macaco macaco = new Macaco(nomeMacaco);
        
        macaco.comer();
        macaco.verBucho();
        macaco.digerir();
        macaco.verBucho();

        sc.close();
    }
}