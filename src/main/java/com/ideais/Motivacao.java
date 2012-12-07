package com.ideais;

class ListaFilmes{

	public ListaFilmes(Cinema ... cinema) {
		
	}
	
}

class Cinema{

	public Cinema(String string) {
		
	}
	
}



public class Motivacao {
	
	public static void main(String[] args) {
		ListaFilmes filmes = new ListaFilmes( new Cinema( "filmes_rioSul.txt" ), new Cinema( "filmesNorteShopping.txt" ) );
	}

}
