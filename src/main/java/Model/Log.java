package Model;

import folaha_de_pagamento.Strategy;

public class Log {
    private int id;
    private String op;
    private Empregado E;
    private Venda V;

    public int getId(){return  this.id;}
    public String getOp(){return this.op;}

    public Empregado getEmpregado() {
        return E;
    }

    public Venda getVenda() {
        return V;
    }

    public void setId(int id){this.id = id;}
    public void setOp(String op){this.op = op;}
    public void setEmpregado(Empregado e){this.E = e;}
    public void setVenda(Venda v){this.V = v;}
}
