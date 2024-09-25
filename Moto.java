import java.util.Scanner;

public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void calcularValorAluguel(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias que o veículo será alugado: ");
        int dias = scanner.nextInt();
        scanner.close();
        
        double valor = 50*dias + (1.0/10)*cilindradas;

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Valor aluguel R$: " + valor);

    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
