public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularValorAluguel(int dias){
        return dias * 50 + cilindradas * 0.10;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "[ Cilindradas: " + getCilindradas() + " || Ano: " + getAno() + " || Marca: " + getMarca()
                + " || Modelo: " + getModelo() + " ]";
    }
    
}
