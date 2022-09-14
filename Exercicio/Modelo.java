import java.util.ArrayList;

public class Modelo {
    
    public int id;
    public String nome;
    public int ano;
    public ArrayList<Carro> carros;

    public Modelo(
        int id,
        String nome,
        int ano
    ) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.carros = new ArrayList<Carro>();
    }
}
