package folaha_de_pagamento.Command;

import Model.Banco;
import Model.Log;

public class RemoverVenda implements consultCommand {
    int id;
    @Override
    public Log consultBd(Banco bd) {
        Log E = new Log();
        E.setOp("RV");
        E.setVenda(bd.removerVenda(id));

        return E;
    }
    public void setId(int i){this.id = i;}
}
