public class Colecao {
    public static void main(String[] args) {
        
        Modelo modeloFord = new Modelo(0, "Ford Ka", 1993);
        Modelo modeloMustang = new Modelo(1, "Mustang Preto", 2022);

        Motor motorFordKa = new Motor(0, 60, 2);
        Motor motorMustang = new Motor(1, 62, 4);

        Carro carroUm = new Carro(
            0,
            "prata",
            2021,
            modeloFord,
            motorFordKa
        );
        Carro carroTres = new Carro(
            0,
            "preto",
            2020,
            modeloFord,
            motorFordKa
        );
        Carro carroDois = new Carro(
            1,
            "preto",
            2022,
            modeloMustang,
            motorMustang
        );

        System.out.println("Primeiro Carro: ");
        System.out.println("Ano do Carro: " + carroUm.ano);
        System.out.println("Nome do Modelo: " + carroUm.modelo.nome);
        System.out.println("Ano do Modelo: " + carroUm.modelo.ano);
        System.out.println("Cor: " + carroUm.cor);

    }
}
