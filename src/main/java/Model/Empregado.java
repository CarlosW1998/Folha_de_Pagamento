package Model;

public class Empregado {
    private int id, tipo;
    private String nome, endereco;

    @Override
    public String toString(){
        return "Id: " + id + "\nNome: " + nome + "\nTipo: " + tipo + "\n\n";
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getTipo() {
        return this.tipo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id){ this.id = id; }

    public void setNome(String nome){this.nome = nome;}

    public void setEndereco(String endereco){this.endereco = endereco;}

    public void setTipo(int tipo){this.tipo = tipo;}
}
