public class Carro {

    public int id;
    public String cor;
    public int ano;
    public int modeloId;
    public int motorId;

    public Modelo modelo;
    public Motor motor;

    public Carro(
        int id,
        String cor,
        int ano,
        Modelo modelo,
        Motor motor
    ) {
        this.id = id;
        this.cor = cor;
        this.ano = ano;
        this.modeloId = modelo.id;
        this.motorId = motor.id;

        this.modelo = modelo;
        this.motor = motor;
    }
    

}