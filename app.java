public class app {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "308", 2007, 160);
        moto.alugar();
        moto.calcularValorAluguel();
        moto.devolver();
    }
}
