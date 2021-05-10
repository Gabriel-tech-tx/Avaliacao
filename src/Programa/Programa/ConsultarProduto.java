package Programa;

import java.util.List;
import java.util.Scanner;

public class ConsultarProduto {
    

    public void exibirProdutos(List<Produto> listaProdutos, Scanner ler){
        System.out.printf("|%-10.10s|\t%-12.12s|\t%-20.20s|\t%-15.15s|\n", "Código", "Produto", "Valor (R$)", "Quantidade");
        listaProdutos.forEach(p ->
        System.out.printf("|%-10.10s|\t%-12.12s|\t%-20.20s|\t%-15.15s|\n", p.getCodigo(), p.getNome(),p.getValor(), p.getQuant()));
        

    }
}
