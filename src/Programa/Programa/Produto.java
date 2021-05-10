package Programa;

import java.util.stream.Stream;

public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    private int quant;
    
    
    
    public Produto( String nome, int codigo, int quant, Double valor){
        this.nome = nome;
        this.codigo = codigo;
        this.quant = quant;
        this.valor = valor;
    }


   


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

     @Override
    public String toString() {
        return "Produto codigo=" + codigo + ", -nome=" + nome + ", quant=" + quant + ", valor=" + valor;
    }




    public static Stream<Produto> stream() {
        return null;
    }

    public int removerQuantidade(int quantidade){
        return quant = quant - quantidade;
    }
    
}

