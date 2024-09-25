import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma das opções a seguir: ");
        System.out.println("1. Aluguel");
        System.out.println("2. Devolução");
        System.out.println("3. Pagamento");
        int n = scanner.nextInt();
        scanner.close();

        switch (n) {
            case 1:

             break;
            
            case 2:

                break;
            case 3:
            
                break;
            default:
            System.out.println("Selecione uma opção valida.");
                break;
        }


    }
}