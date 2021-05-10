package Programa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.RealizarVendas;




public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao = 0;
        List<Produto> listaProdutos = new ArrayList<>();

        do{
            menu.exibirMenuPrincipal();
            opcao = ler.nextInt();
            ler.nextLine();
            switch(opcao) {
                case 1:
                  menuProduto(ler, menu, listaProdutos);
                  break;
                case 2:
                  menuRelatorios(ler, menu, listaProdutos);
                break;
                case 3:
                System.out.println("- Realizando Venda -");
                System.out.println("------------------------");
                System.out.println("\nDigite o Codigo do produto ");
                System.out.printf("Escolha: ");
                int cod = ler.nextInt();
                ler.nextLine();
                System.out.println("\n--------------------------------");
                System.out.println("Digite a Quantidade do Produto");
                System.out.printf("Escolha: ");
                int quantidadeVendida = ler. nextInt();
                ler.nextLine();


                DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String dataHoje = fd.format(LocalDateTime.now());

                boolean achei = false;
                for (Produto p : listaProdutos) {
                        if(p.getCodigo() == cod){
                            achei = true;
                            p.removerQuantidade(quantidadeVendida);
                            RealizarVendas.add(new RealizarVendas(quantidadeVendida, LocalDate.parse(dataHoje, fd),p));
                            System.out.println("\nVenda Realizada com sucesso!");
                            break;
                    } 
                }
                if (achei == false){
                    System.out.println("\nProduto não encontrado!! \nVoltando ao menu...\n");
                    break;
                }
                
                break;
                case 0:
                  System.out.println("Encerrando aplicação");  
            }
        } while (opcao !=0);

        ler.close();
    }

      
    



private static void menuProduto(Scanner ler, Menu menu, List<Produto> listaProdutos){
    int opcaoMenu = 0;
    do{
        opcaoMenu = menu.exibirMenuProdutos(ler);
        System.out.println("Usuário escolheu a opção " + opcaoMenu);
        switch(opcaoMenu) {
            case 1:
              Produto prod;
              CadastrarProdutos cad = new CadastrarProdutos();
              prod = cad.cadastraProduto(ler);
              listaProdutos.add(prod);
              break;
            case 2:
              ConsultarProduto consultarProduto = new ConsultarProduto();
              consultarProduto.exibirProdutos(listaProdutos, ler);
            break;
            case 0:
              break;
            default:
              System.out.println("Opção inválida");
        }
    }while (opcaoMenu !=0);
  }

private static void menuRelatorios(Scanner ler, Menu menu, List<Produto> listaProdutos) {
  int opcaoMenu = 0;
  do{
    opcaoMenu = menu.exibirMenuRelatorios(ler);
    System.out.println("Usuário escolheu a opção " + opcaoMenu);
    switch(opcaoMenu) {
      case 1:
        RelatorioProduto rele = new RelatorioProduto();
        System.out.println("O usuário escolheu a opção" + opcaoMenu);
        rele.Produtos(ler, listaProdutos);
      break;
      case 2: 

      break;
    }
  }while (opcaoMenu !=0);
 }
}


