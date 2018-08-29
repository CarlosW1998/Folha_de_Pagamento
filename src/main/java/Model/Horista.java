package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Horista extends Empregado {
    double salarioHorario;
    ArrayList<Date> cartoes;
    public Horista(){
        this.cartoes = new ArrayList<Date>();
    }

    public void adicionarCartao(String data){
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        Date newdate = null;
        try{
            newdate = ft.parse(data);
            this.cartoes.add(newdate);
        } catch (ParseException e) {
            System.out.println("Dados invalidos");
        }

    }

    public void setSalarioHorario(double salario){
        this.salarioHorario = salario;
    }
    public double getSalarioHorario(){
        return  this.salarioHorario;
    }

}
