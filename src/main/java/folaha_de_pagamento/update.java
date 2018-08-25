package folaha_de_pagamento;

import Model.Empregado;
import Model.Horista;

import java.util.Scanner;

public class update {
    public void updateEmpregado(Empregado E){
        System.out.println("Digite 1 para alterar o Nome, 2 para alterar o tipo");
    }
    public void adicionarCartao(Empregado E){
        if(!(E instanceof Horista)){
            System.out.println("Funcionario não é horista");
            return;
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a Data(dd/mm/aaaa): ");
        ((Horista)E).adicionarCartao(s.nextLine());
    }
}
