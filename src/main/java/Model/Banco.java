package Model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Banco {
    private ArrayList<Empregado> empregados;
    private  ArrayList<Venda> vendas;
    private AtomicInteger idControl, controlvendas;

    public Banco(){
        this.empregados = new ArrayList<Empregado>();
        this.idControl = new AtomicInteger(0);
        this.controlvendas = new AtomicInteger(0);
        this.vendas = new ArrayList<Venda>();
    }
    public void adicionarEmpregado(Empregado E){
        E.setId(this.idControl.incrementAndGet());
        empregados.add(E);
    }
    public  void adicionarVenda(Venda E){
        E.setId(this.controlvendas.incrementAndGet());
        this.vendas.add(E);
    }


    public Empregado getEmpregado(int id){
        for(int a = 0; a < this.empregados.size(); a++) {
            if(empregados.get(a).getId() == id){
                return empregados.get(a);
            }
        }
        System.out.println("Empregado não existe");
        return null;
    }
    public void removerEmpregado(int id){
        for(int a = 0; a < this.empregados.size(); a++) {
            if(empregados.get(a).getId() == id){
                empregados.remove(a);
                System.out.println("Empregao removido");
                return;
            }
        }
        System.out.println("Usuario não existe");
    }
    public void show(){
        empregados.forEach((e) -> System.out.println(e.toString()));
    }
}
