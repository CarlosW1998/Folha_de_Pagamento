package folaha_de_pagamento;

import Model.*;

import java.util.Scanner;

public class Creater {
    private Scanner scan;
    public Creater(){
        scan = new Scanner(System.in);
    }
    public Empregado criarEmpregado(){
        Empregado E;
        String aux;
        System.out.print("Tipo do Funcionario: (1) Assalarioado (2) Comissionado (3) Horista: ");
        aux = this.scan.nextLine();
        Strategy.strategy s = Strategy.criarEmpregado.values()[Integer.parseInt(aux)-1];
        return s.novoEmpregado();
    }

    public Venda crirarVenda(){
        System.out.print("Valor da Venda:");
        Venda E = new Venda();
        String aux = scan.nextLine();
        E.setValor(Double.parseDouble(aux));
        System.out.print("Id do Empregado que realizou a venda: ");
        aux = scan.nextLine();
        E.setEmpregado(Integer.parseInt(aux));
        return  E;
    }
}
