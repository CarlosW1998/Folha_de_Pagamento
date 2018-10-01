package folaha_de_pagamento;

import Model.Assalariado;
import Model.Comissionado;
import Model.Empregado;
import Model.Horista;

import java.util.Scanner;

public class Strategy {
    public interface strategy{
        Empregado novoEmpregado();
    }
    public enum criarEmpregado implements strategy{
        ASSALARIADO{
            @Override
            public Empregado novoEmpregado() {
                Empregado E = new Assalariado();
                String aux;
                Scanner scan = new Scanner(System.in);

                E.setTipo(1);
                System.out.print("Salario: ");
                aux = scan.nextLine();
                ((Assalariado)E).setSalario(Double.parseDouble(aux));

                System.out.print("Nome:");
                aux = scan.nextLine();
                E.setNome(aux);

                System.out.print("Enderenço: ");
                aux = scan.nextLine();
                E.setEndereco(aux);

                return E;
            }
        },
        COMISSIONADO{
            @Override
            public Empregado novoEmpregado() {
                Empregado E;
                String aux;
                Scanner scan = new Scanner(System.in);

                E = new Comissionado();
                E.setTipo(2);

                System.out.print("Salario: ");
                aux = scan.nextLine();
                ((Comissionado)E).setSalario(Double.parseDouble(aux));

                System.out.print("Comissao: ");
                aux = scan.nextLine();
                ((Comissionado)E).setComissao(Double.parseDouble(aux));

                System.out.print("Nome:");
                aux = scan.nextLine();
                E.setNome(aux);

                System.out.print("Enderenço: ");
                aux = scan.nextLine();
                E.setEndereco(aux);

                return E;
            }
        },
        HORISTA{
            @Override
            public Empregado novoEmpregado() {
                Empregado E = new Assalariado();
                String aux;
                Scanner scan = new Scanner(System.in);

                E = new Horista();
                E.setTipo(3);

                System.out.print("Salario: ");
                aux = scan.nextLine();
                ((Horista)E).setSalarioHorario(Double.parseDouble(aux));

                System.out.print("Nome:");
                aux = scan.nextLine();
                E.setNome(aux);

                System.out.print("Enderenço: ");
                aux = scan.nextLine();
                E.setEndereco(aux);

                return E;
            }
        }
    }
}
