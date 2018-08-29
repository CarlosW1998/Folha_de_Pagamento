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
        if(Integer.parseInt(aux) == 1){
            E = new Assalariado();
            E.setTipo(1);

            System.out.print("Salario: ");
            aux = scan.nextLine();
            ((Assalariado)E).setSalario(Double.parseDouble(aux));
        }
        else if(Integer.parseInt(aux) == 2){
            E = new Comissionado();
            E.setTipo(2);

            System.out.print("Salario: ");
            aux = scan.nextLine();
            ((Comissionado)E).setSalario(Double.parseDouble(aux));

            System.out.print("Comissao: ");
            aux = scan.nextLine();
            ((Comissionado)E).setComissao(Double.parseDouble(aux));
        }
        else if(Integer.parseInt(aux) == 3){
            E = new Horista();
            E.setTipo(3);

            System.out.print("Salario: ");
            aux = scan.nextLine();
            ((Horista)E).setSalarioHorario(Double.parseDouble(aux));

        }
        else {
            E = new Empregado();
        }

        System.out.print("Nome:");
        aux = scan.nextLine();
        E.setNome(aux);

        System.out.print("Enderenço: ");
        aux = scan.nextLine();
        E.setEndereco(aux);

        return E;
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
