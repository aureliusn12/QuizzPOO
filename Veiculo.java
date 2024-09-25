public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean alugado;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.alugado = false;
    }

    public void alugar(){
        this.alugado = true;
    }

    public void devolver(){
        this.alugado = false;
    }

    public abstract void calcularValorAluguel();
    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    public boolean getAlugado(){
        return alugado;
    }
}
