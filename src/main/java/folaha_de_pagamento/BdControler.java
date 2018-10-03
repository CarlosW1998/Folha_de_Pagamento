package folaha_de_pagamento;

import Model.Banco;
import Model.Empregado;
import Model.Log;
import folaha_de_pagamento.Command.consultCommand;

import java.util.Stack;

public class BdControler {
    private Banco bd;
    Stack<Log> back;
    Stack<Log> foward;

    public BdControler(){
        this.bd = new Banco();
        this.back = new Stack<Log>();
        this.foward = new Stack<Log>();
    }
    public void bdOperation(consultCommand C){
        Log mylog = C.consultBd(this.bd);
        back.push(mylog);
        foward = new Stack();
    }
    public void list(){
        this.bd.show();
    }
    public Empregado getEmp(int id){
        return this.bd.getEmpregado(id);
    }
    private Log makeaction(Log E){
        Log currentLog = new Log();
        if(E.getOp().equals("AE")){
            currentLog.setOp("RE");
            currentLog.setEmpregado(this.bd.removerEmpregado(E.getId()));
        }
        else if(E.getOp().equals("AV")){
            currentLog.setOp("RV");
            currentLog.setVenda(this.bd.removerVenda(E.getId()));
        }
        else if(E.getOp().equals("RE")){
            currentLog.setOp("AE");
            currentLog.setId(this.bd.adicionarEmpregado(E.getEmpregado()));
        }
        else if(E.getOp().equals("RV")){
            currentLog.setOp("AV");
            currentLog.setId(this.bd.adicionarVenda(E.getVenda()));
        }
        return currentLog;
    }
    public void redu(){
        if(!back.empty()){
            foward.push(makeaction(back.pop()));
        }
    }
    public void undo(){
        if(!foward.empty()){
            back.push(makeaction(foward.pop()));
        }
    }
}
