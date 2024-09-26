public class Caminhao extends Veiculo{
    private double capacidadeCarga; //toneladas
    
    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga){
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }
    
    @Override
    public double calcularValorAluguel(int dias){
        return dias * 200 + capacidadeCarga * 50;
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "[ Capacidade de Carga: " + getCapacidadeCarga() + " || Ano: " + getAno() + " || Marca: "
                + getMarca() + " || Modelo: " + getModelo() + " ]";
    }
    
}