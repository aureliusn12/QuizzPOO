
public class Carro extends Veiculo {
    private int quantidadePortas;
    
    public Carro(String marca, String modelo, int ano,int quantidadePortas) {
        super(marca, modelo, ano);      
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularValorAluguel(int dias){
    return dias * 100 + quantidadePortas * 10;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String toString() {
        return "[ Quantidade de portas: " + getQuantidadePortas() + " || Ano: " + getAno() + " || Marca: "
                + getMarca() + " || Modelo: " + getModelo() + " ]";
    }    
    
}