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
    public int adicionarEmpregado(Empregado E){
        int aux = this.idControl.incrementAndGet();
        E.setId(aux);
        empregados.add(E);
        return aux;
    }
    public  int adicionarVenda(Venda E){
        int aux = this.controlvendas.incrementAndGet();
        E.setId(aux);
        this.vendas.add(E);
        return aux;
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
    public Empregado removerEmpregado(int id){
        for(int a = 0; a < this.empregados.size(); a++) {
            if(empregados.get(a).getId() == id){
                Empregado E = empregados.get(a);
                empregados.remove(a);
                System.out.println("Empregao removido");
                return E;
            }
        }
        System.out.println("Usuario não existe");
        return null;
    }
    public Venda removerVenda(int id){
        for(int a = 0; a < this.vendas.size(); a++){
            if(vendas.get(a).getId() == id){
                Venda E = vendas.get(a);
                vendas.remove(a);
                System.out.println("Venda Removida Com Sucesso");
                return E;
            }
        }
        System.out.println("Venda não existe");
        return null;
    }
    public void show(){
        empregados.forEach((e) -> System.out.println(e.toString()));
    }
}
