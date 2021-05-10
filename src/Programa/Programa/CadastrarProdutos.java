package Programa;
import java.util.Scanner;





public class CadastrarProdutos{

    public Produto cadastraProduto(Scanner ler) {
       System.out.println("Informe o código do produto: ");
       int cod = ler.nextInt();
       ler.nextLine();
       System.out.println("Informe o nome do produto: ");
       String nome = ler.nextLine();
       System.out.println("Informe o valor do produto");
       Double valor = ler.nextDouble();
       System.out.println("Informe a quantidade do produto");
       int quantidade = ler.nextInt();
       return  new Produto(nome, cod, quantidade, valor); 
    }
    
}
          
                  

                