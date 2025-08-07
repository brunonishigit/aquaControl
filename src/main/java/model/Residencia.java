package model;

public class Residencia {
    private String nome;
    private String endereco;
    private int pessoas;
    private int consumo;

    public Residencia(String nome, String endereco, int pessoas) {
        this.nome = nome;
        this.endereco = endereco;
        this.pessoas = pessoas;
        this.consumo = pessoas * 150 * 30; // Consumo mensal recomendado
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public int getPessoas() { return pessoas; }
    public int getConsumo() { return consumo; }
}    
    
    

