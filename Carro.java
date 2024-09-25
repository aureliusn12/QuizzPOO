import java.util.Scanner;

public class Carro extends Veiculo {
    private int quantidadePortas;
    
    public Carro(String marca, String modelo, int ano,int quantidadePortas) {
        super(marca, modelo, ano);      
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void calcularValorAluguel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias que o veículo será alugado: ");
        int dias = scanner.nextInt();
        scanner.close();
        
        double valor = 100*dias + 10*quantidadePortas;

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Valor aluguel R$: " + valor);
    }
    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}