package Model;

public class Comissionado extends Empregado {
    double salario, comissao;
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }

    public double getSalario(){
        return  this.salario;
    }
    public double getComissao(){
        return  this.comissao;
    }
}
