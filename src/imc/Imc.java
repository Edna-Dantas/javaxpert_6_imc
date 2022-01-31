package imc;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
        
		// Declara��o das vari�veis
		int pesoDoUsuario;
		double alturaDoUsuario, imc;
		String nomeDoUsuario;
	
		
		//Ler o teclado do usu�rio
		Scanner leitor = new Scanner(System.in); 		
		
		System.out.println("Qual o seu nome");
		nomeDoUsuario = leitor.nextLine();
		
		//Mostrar qual � o caractere que est� na posi��o 3
		System.out.println(nomeDoUsuario.charAt(2));
		
		//Criando as vari�veis para o c�lculo
		System.out.println(nomeDoUsuario + " digite seu peso: "); //Concatena��o
		pesoDoUsuario = leitor.nextInt();
		
		System.out.println("\nDigite a sua altura: ");
		alturaDoUsuario = leitor.nextDouble();
					
		leitor.close();	
		
		imc = pesoDoUsuario/(alturaDoUsuario*alturaDoUsuario);
				
		//System.out.println("");		
		System.out.println("\n" + nomeDoUsuario + ", seu imc � " + imc + ".");
		
		String email = "na.edna@gmail.com";
		System.out.println(email.endsWith("com"));
		System.out.println(email.contains("@"));
		
		System.out.println("------------------------------------");
		
		System.out.println(nomeDoUsuario.equals("Edna"));
		System.out.println(nomeDoUsuario.equalsIgnoreCase("edna"));	
		
		// Determinar a classifica��o do IMC
		if (imc < 18.5) {
			System.out.println("Voc� est� ABAIXO DO PESO!!");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("PESO NORMAL");			
		
		} else if (imc >= 25 && imc < 30) {
			System.out.println("SOBREPESO");
			
		}else if (imc >= 30 && imc < 35) {
			System.out.println("OBESIDADE GRAU 1");
		}
				
	}

}
