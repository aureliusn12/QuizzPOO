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
        int opcao1 = scanner.nextInt();
        
        switch (opcao1) {
            case 1:
                System.out.println("Digite o número de dias para o aluguel: ");
                int dias = scanner.nextInt();

                System.out.println("Qual veículo voce deseja alugar?");
                System.out.println("-------- CARROS --------");
                System.out.println("1. " + carro1.toString());
                System.out.println("2. " + carro2.toString());
                System.out.println("3. " + carro3.toString());
                System.out.println("--------- MOTOS ---------");
                System.out.println("4. " + moto1.toString());
                System.out.println("5. " + moto2.toString());
                System.out.println("6. " + moto3.toString());
                System.out.println("------- CAMINHÕES -------");
                System.out.println("7. " + caminhao1.toString());
                System.out.println("8. " + caminhao2.toString());
                System.out.println("9. " + caminhao3.toString());
                int opcao2 = scanner.nextInt();

                if (opcao2 == 1) {
                    if (!carro1.estaAlugado()) {
                    carro1.alugar();
                    System.out.println("Valor do aluguel: R$ " + carro1.calcularValorAluguel(dias));
                    } else {
                        System.out.println("O carro já está alugado.");
                    }
                } 

                if (opcao2 == 2) {
                    if (!carro2.estaAlugado()) {
                    carro2.alugar();
                    System.out.println("Valor do aluguel: R$ " + carro2.calcularValorAluguel(dias));
                    }else {
                        System.out.println("O carro já está alugado.");
                    } 
                }

                if (opcao2 == 3) {
                    if (!carro3.estaAlugado()) {
                    carro3.alugar();
                    System.out.println("Valor do aluguel: R$ " + carro3.calcularValorAluguel(dias));
                    }else {
                        System.out.println("O carro já está alugado.");
                    }
                } 

                if (opcao2 == 4) {
                    if (!moto1.estaAlugado()) {
                    moto1.alugar();
                    System.out.println("Valor do aluguel: R$ " + moto1.calcularValorAluguel(dias));
                    }else {
                        System.out.println("A moto já está alugada.");
                    } 
                }

                if (opcao2 == 5) {
                    if (!moto2.estaAlugado()) {
                    moto2.alugar();
                    System.out.println("Valor do aluguel: R$ " + moto2.calcularValorAluguel(dias));
                    }else {
                        System.out.println("A moto já está alugada.");
                    } 
                }

                if (opcao2 == 6) {
                    if (!moto3.estaAlugado()) {
                    moto3.alugar();
                    System.out.println("Valor do aluguel: R$ " + moto3.calcularValorAluguel(dias));
                    }else {
                        System.out.println("A moto já está alugada.");
                    } 
                }

                if (opcao2 == 7) {
                    if (!caminhao1.estaAlugado()) {
                    caminhao1.alugar();
                    System.out.println("Valor do aluguel: R$ " + caminhao1.calcularValorAluguel(dias));
                    }else {
                        System.out.println("O caminhão já está alugado.");
                    } 
                }

                if (opcao2 == 8) {
                    if (!caminhao2.estaAlugado()) {
                    caminhao2.alugar();
                    System.out.println("Valor do aluguel: R$ " + caminhao2.calcularValorAluguel(dias));
                    }else {
                        System.out.println("O caminhão já está alugado.");
                    } 
                }

                if (opcao2 == 9) {
                    if (!caminhao3.estaAlugado()) {
                    caminhao3.alugar();
                    System.out.println("Valor do aluguel: R$ " + caminhao3.calcularValorAluguel(dias));
                    }else {
                        System.out.println("O caminhão já está alugado.");
                    } 
                }
                break;

            case 2:
                System.out.println("Qual veículo voce deseja devolver? ");
                System.out.println("-------- CARROS --------");
                System.out.println("1. " + carro1.toString());
                System.out.println("2. " + carro2.toString());
                System.out.println("3. " + carro3.toString());
                System.out.println("--------- MOTOS ---------");
                System.out.println("4. " + moto1.toString());
                System.out.println("5. " + moto2.toString());
                System.out.println("6. " + moto3.toString());
                System.out.println("------- CAMINHÕES -------");
                System.out.println("7. " + caminhao1.toString());
                System.out.println("8. " + caminhao2.toString());
                System.out.println("9. " + caminhao3.toString());
                int opcao3 = scanner.nextInt();
                
                if (opcao3 == 1) {
                    System.out.println("cuzin");
                    carro1.devolver();
                }

                if (opcao3 == 2) {
                    carro2.devolver();
                }

                if (opcao3 == 3) {
                    carro3.devolver();
                }

                if (opcao3 == 4) {
                    moto1.devolver();
                }

                if (opcao3 == 5) {
                    moto2.devolver();
                }

                if (opcao3 == 6) {
                    moto3.devolver();
                }

                if (opcao3 == 7) {
                    caminhao1.devolver();
                }

                if (opcao3 == 8) {
                    caminhao2.devolver();
                }

                if (opcao3 == 9) {
                    caminhao3.devolver();
                }
                break;

            default:
            System.out.println("Selecione uma opção valida.");
                break;
        }

        scanner.close();
    }
}