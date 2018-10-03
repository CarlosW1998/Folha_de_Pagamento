package folaha_de_pagamento.Command;

import Model.Banco;
import Model.Log;

public class RemoverEmpregado implements consultCommand {
    private int id;
    @Override
    public Log consultBd(Banco bd) {
        Log E = new Log();
        E.setOp("RE");
        E.setEmpregado(bd.removerEmpregado(id));

        return E;
    }
    public void setId(int i){this.id = i;}
}
