import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BYD", "Seal", 2024, 4);
        Carro carro2 = new Carro("Tesla", "Cybertruck", 2023, 4);
        Carro carro3 = new Carro("Ford", "Ram", 2023, 4);
        Moto moto1 = new Moto("Honda", "308", 2007, 160);
        Moto moto2 = new Moto("Yamaha", "pop 100", 2005, 120);
        Moto moto3 = new Moto("Kawasaki", "ZH2", 2016, 220);

        Caminhao caminhao1 = new Caminhao("Mercedes", "Benz Axor 2544", 2021, 20);
        Caminhao caminhao2 = new Caminhao("BMW", "BMW X600", 2023, 300);
        Caminhao caminhao3 = new Caminhao("Ford", "Cargo 816", 2022, 10);
        
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
                    System.out.println("1. " + carro1);
                    System.out.println("2. " + carro2);
                    System.out.println("3. " + carro3);


                } 

                if (aluguel == 2) {
                    System.out.println("Selecione a moto desejada: ");
                    System.out.println("1. " + moto1);
                    System.out.println("2. " + moto2);
                    System.out.println("3. " + moto3);

                }

                if (aluguel == 3) {
                    System.out.println("Selecione o caminhão desejado: ");
                    System.out.println("1. " + caminhao1);
                    System.out.println("2. " + caminhao2);
                    System.out.println("3. " + caminhao3);


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
    