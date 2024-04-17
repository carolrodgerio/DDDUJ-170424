package br.com.corrigir;

import java.time.LocalDate;

public class TesteLocalDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		int ano = date.getYear();
		System.out.println("Ano atual: " + ano);

	}

}
