package folaha_de_pagamento.Command;

import Model.Banco;
import Model.Empregado;
import Model.Log;

public class AdicionarEmpregado implements consultCommand{
    private Empregado E;

    @Override
    public Log consultBd(Banco bd) {
        int aux = bd.adicionarEmpregado(this.E);
        Log newLog = new Log();
        newLog.setId(aux);
        newLog.setOp("AE");
        return newLog;
    }

    public void setEmpregado(Empregado e) {
        E = e;
    }
}
