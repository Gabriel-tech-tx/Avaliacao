package Programa;

import java.util.Scanner;

public class Menu {
    
    public void exibirMenuPrincipal(){
        System.out.println("Escolha a opção desejada");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Relatórios");
        System.out.println("3 - Realizar venda");
        System.out.println("0 - Sair");
    }

    public int exibirMenuRelatorios(Scanner ler){
        System.out.println("Escolha o relatório");
        System.out.println("1 - Produtos");
        System.out.println("2 - Vendas por período detalhado");
        System.out.println("3 - Vendas por período consolidado");
        System.out.println("0 - Voltar ao menu principal");
        int op = ler.nextInt();
        return op;
    }

    public int exibirMenuProdutos(Scanner ler){
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Incluir produto");
        System.out.println("2 - Consultar produto");
        System.out.println("0 - voltar ao menu anterior");
        int op = ler.nextInt();
        return op;
    }
}
