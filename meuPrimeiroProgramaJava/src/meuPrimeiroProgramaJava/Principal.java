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
public class Principal { 

	public static void main(String[] args) {
		
		//Saudação e pergunta o nome.
		System.out.println("Olá amigo!\nQual é o seu nome?"); 
		
		//Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Saldação específica para o nome lido.
		System.out.printf("Olá %s!\n", nome);

	}

}
