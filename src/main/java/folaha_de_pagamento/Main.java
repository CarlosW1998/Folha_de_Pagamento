package folaha_de_pagamento;

import Model.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        Banco myBd = new Banco();
        Creater mycreater = new Creater();
        update myupdater = new update();
        int aux;

        while(true){
            System.out.println("Digite 1 para Adicionar um Empregado");
            System.out.println("Digite 2 para Listar os Empregados");
            System.out.println("Digite 3 para Deletar um Empregado");
            System.out.println("Digite 4 para Lançar um Cartao");
            System.out.println("Digite 5 para Lançar uma Venda");

            aux = myscan.nextInt();

            if(aux == 1){ myBd.adicionarEmpregado(mycreater.criarEmpregado()); }
            else if(aux == 2){ myBd.show(); }
            else if(aux == 3){
                System.out.println("Informe o Id do emrpegado");
                myBd.removerEmpregado(myscan.nextInt());
            }
            else if(aux == 4){
                System.out.println("Informe o Id do emrpegado");
                myupdater.adicionarCartao(myBd.getEmpregado(myscan.nextInt()));

            }
            else if(aux == 5){ myBd.adicionarVenda(mycreater.crirarVenda());}
        }
    }
}
