package org.example.principal;

import org.example.conta.Conta;
import org.example.conta.TipoDeConta;

import java.util.Scanner;

public class Principal {

    private Conta conta = new Conta("Thiago de sena", TipoDeConta.CORRENTE,2500);
    private Scanner scanner = new Scanner(System.in);
    private String opcoes = """
            Operações
            
            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair
            
            Digite a opção desejada:
            """;

    private String gerarMenu(){
        return """
            **************************************
            Dados iniciais do cliente:
            
            """+
            "Nome: "+conta.getUsuario()+"\n"+
            "Tipo de Conta: "+conta.getTipoDeConta()+"\n"+
            "Saldo inicial: "+conta.getSaldo()+"\n"+
            "**************************************\n\n";
    }
    public void telaInicial(){
        System.out.println(gerarMenu());

        int opcao;
        do {
            System.out.println(opcoes);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    conta.consultarValores();
                    break;
                case 2:
                    conta.receberValor();
                    break;
                case 3:
                    conta.transferirValor();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }while (opcao!=4);

        System.out.println("Fim da operação");
    }
}
