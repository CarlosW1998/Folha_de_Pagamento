package folaha_de_pagamento.Command;

import Model.Banco;
import Model.Log;

public interface consultCommand {
    Log consultBd(Banco bd);
}
