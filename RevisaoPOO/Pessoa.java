import java.util.ArrayList;

public class Pessoa{
    private int id;
    private String nome;
    private ArrayList<Pet> Pets;

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.Pets = new ArrayList<>();
    }

    public Pessoa() {

    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Pet> getPets() {
        return Pets;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPets(ArrayList<Pet> pets) {
        Pets = pets;
    }
}

