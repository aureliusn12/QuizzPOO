import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma das opções a seguir: ");
        System.out.println("1. Aluguel");
        System.out.println("2. Devolução");
        System.out.println("3. Pagamento");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Qual tipo de veículo voce deseja alugar?");
                System.out.println("1. Carro");
                System.out.println("2. Moto");
                System.out.println("3. caminhão");
                int aluguel = scanner.nextInt();

                if (aluguel == 1) {
                    System.out.println("Selecione o carro desejado: ");

                } 

                if (aluguel == 2) {
                    System.out.println("Selecione a moto desejada: ");

                }

                if (aluguel == 3) {
                    System.out.println("Selecione o caminhão desejado: ");


                } else{
                    System.out.println("Selecione uma opção válida.");
                }
             
                break;
            
            case 2:
                System.out.println("Qual tipo de veículo voce deseja devolver? ");
                System.out.println("1. Carro ");
                System.out.println("2. Moto ");
                System.out.println("3. caminhão ");
                int devolucao = scanner.nextInt();
                
                if (devolucao == 1) {
                    System.out.println("Selecione o carro que deseja devolver: ");

                } 

                if (devolucao == 2) {
                    System.out.println("Selecione a moto que deseja devolver: ");

                    
                }

                if (devolucao == 3) {
                    System.out.println("Selecione o caminaho que deseja devolver: ");
                    

                } else{
                    System.out.println("Selecione uma opção válida");
                }
             
             
                break;

            case 3:
                System.out.println("O valor total é R$:" );

                break;
            default:
            System.out.println("Selecione uma opção valida.");
                break;
        }

        scanner.close();
    }
}