package folaha_de_pagamento.Command;

import Model.Banco;
import Model.Log;
import Model.Venda;

public class CriarVenda implements consultCommand {
    Venda E;

    @Override
    public Log consultBd(Banco bd) {
        int aux = bd.adicionarVenda(E);
        Log newLog = new Log();
        newLog.setId(aux);
        newLog.setOp("AV");
        return newLog;
    }
    public void setvenda(Venda e){
        E = e;
    }
}
