package Model;

public class Venda {
    private double valor;
    private int empregado, id;


    public void setValor(double valor){
        this.valor = valor;
    }
    public void setEmpregado(int id){
        this.empregado = id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getValor(){
        return this.valor;
    }
    public int getEmpregado(){
        return this.empregado;
    }
    public int getId(){
        return  this.id;
    }
}
