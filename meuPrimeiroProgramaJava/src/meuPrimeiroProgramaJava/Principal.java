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
		
		//Sauda��o e pergunta o nome.
		System.out.println("Ol� amigo!\nQual � o seu nome?"); 
		
		//Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Salda��o espec�fica.
		System.out.printf("Ol� %s!\n", nome);

	}

}
