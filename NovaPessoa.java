package br.com.pessoaconstrutor;

import java.time.LocalDate;

public class NovaPessoa {

    private String nome;
    private int anoNascimento;

    public NovaPessoa(String nome, int anoNascimento) {
        this.nome = nome;
        //this.anoNascimento = anoNascimento;
        setAnoNascimento(anoNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
    	
    	LocalDate anoAtual = LocalDate.now();
        try {
            if (anoNascimento >= 1900 && anoNascimento < anoAtual.getYear()) {
          
                this.anoNascimento = anoNascimento;
            }else {
            	throw new Exception("Ano de nascimento fora da faixa permitida");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

}
