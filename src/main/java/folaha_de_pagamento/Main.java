package folaha_de_pagamento;

import Model.Banco;
import folaha_de_pagamento.Command.AdicionarEmpregado;
import folaha_de_pagamento.Command.CriarVenda;
import folaha_de_pagamento.Command.RemoverEmpregado;
import folaha_de_pagamento.Command.RemoverVenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        BdControler myBdControler= new BdControler();
        Creater mycreater = new Creater();
        update myupdater = new update();
        int aux;

        while(true){
            System.out.println("Digite 1 para Adicionar um Empregado");
            System.out.println("Digite 2 para Listar os Empregados");
            System.out.println("Digite 3 para Deletar um Empregado");
            System.out.println("Digite 4 para Lançar um Cartao");
            System.out.println("Digite 5 para Lançar uma Venda");
            System.out.println("Digite 6 para Remover uma Venda");
            System.out.println("Digite 7 para Desfazer uma ação anterior");
            System.out.println("Digite 8 para Refazer uma ação anterior");

            aux = myscan.nextInt();

            if(aux == 1){
                AdicionarEmpregado myemp = new AdicionarEmpregado();
                myemp.setEmpregado(mycreater.criarEmpregado());
                myBdControler.bdOperation(myemp);
            }
            else if(aux == 2){ myBdControler.list();}
            else if(aux == 3){
                RemoverEmpregado myrem = new RemoverEmpregado();
                System.out.println("Informe o Id do emrpegado");
                myrem.setId(myscan.nextInt());
                myBdControler.bdOperation(myrem);
            }
            else if(aux == 4){
                System.out.println("Informe o Id do emrpegado");
                myupdater.adicionarCartao(myBdControler.getEmp(myscan.nextInt()));

            }
            else if(aux == 5){
                CriarVenda myven = new CriarVenda();
                myven.setvenda(mycreater.crirarVenda());
                myBdControler.bdOperation(myven);
            }
            else if(aux == 6){
                RemoverVenda myrem = new RemoverVenda();
                System.out.println("Informe o Id do emrpegado");
                myrem.setId(myscan.nextInt());
                myBdControler.bdOperation(myrem);
            }
            else if(aux == 7){
                myBdControler.redu();
            }
            else if(aux == 8){
                myBdControler.undo();
            }
        }
    }
}
