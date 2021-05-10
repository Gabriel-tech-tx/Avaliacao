package Programa;
import java.util.List;
import java.util.Scanner;


public class RelatorioProduto {
   

    public void Produtos(Scanner ler, List<Produto> listaProdutos){
        System.out.println("******Produtos******");
        if (listaProdutos.isEmpty()){
            System.out.println("Não há menhum produto cadastrado");
          }else {
            ConsultarProduto cp = new ConsultarProduto();
            cp.exibirProdutos(listaProdutos, ler);
          }
        
        

    }
}
