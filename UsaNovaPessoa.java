package br.com.pessoaconstrutor;

import java.time.LocalDate;
import java.util.Scanner;

public class UsaNovaPessoa {

    public static void main(String[] args) {

        try {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite seu Nome: ");
            String nome = scan.nextLine();

            System.out.println("Digite seu ano de nascimento: ");
            int ano = scan.nextInt();

            NovaPessoa pessoa = new NovaPessoa(nome, ano);

            // Obtendo o ano atual
            int anoAtual = LocalDate.now().getYear();

            // Calculando a idade
            int idade = pessoa.calcularIdade(anoAtual);

            // Exibindo a idade
            System.out.println("Idade: " + idade);

            scan.close(); // Fechando o Scanner

        } catch (Exception e) {

            System.out.println("Nome e/ou ano de nascimento inválido.");
        }

    }

}