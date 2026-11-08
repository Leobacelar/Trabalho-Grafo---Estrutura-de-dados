
public class Pessoa {

  
    int id;
    String nome;
    int idade;
    boolean infectado;


    public Pessoa(int id, String nome, int idade, boolean infectado) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.infectado = infectado;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean getInfectado() {
        return infectado;
    }

    
    public void setInfectado(boolean infectado) {
        this.infectado = infectado;
    }
}
