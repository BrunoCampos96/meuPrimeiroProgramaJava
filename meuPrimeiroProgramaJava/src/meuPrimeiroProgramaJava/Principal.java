/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * etc etc...
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author bruno
 *
 */
public class Principal { // Classe que cont�m o m�todo principal

	public static void main(String[] args) { //Este � o m�todo principal
		System.out.println("Ol� amigo!\nQual � o seu nome?"); // Uso do println
		
		//Ler uma string do console utilizando a biblioteca Scanner.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string utilizando o printf.
		System.out.printf("Ol� %s!\n", nome);

	}

}
