import java.util.Scanner;

public class Caminhao extends Veiculo{
    private double capacidadeCarga; //toneladas
    
    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga){
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }
    
    @Override
    public void calcularValorAluguel(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias que o veículo será alugado: ");
        int dias = scanner.nextInt();
        scanner.close();
        
        double valor = 200*dias + 50*capacidadeCarga;

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Valor aluguel R$: " + valor);
        
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}