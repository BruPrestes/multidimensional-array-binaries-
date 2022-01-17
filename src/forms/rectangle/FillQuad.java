package forms.rectangle;

import java.util.Scanner;

public class FillQuad {

	Scanner sc = new Scanner(System.in);
	
	
	public void FillingUp(int C[][]) {
		
		System.out.println("Entre com no máximo 4 linhas digitando entre 1 e 4: ");
		int numLinhas = sc.nextInt();

		while (numLinhas > 3 && numLinhas < 0) {
			System.out.println("Digite corretamente o número de linhas");
			numLinhas = sc.nextInt();
		}
		
		System.out.println("Entre com no máximo 5 colunas digitando entre 1 e 5: ");
		int numColunas = sc.nextInt();
		

		while (numColunas > 4 && numColunas < 0) {
			System.out.println("Digite corretamente o número de colunas");
			numColunas = sc.nextInt();
		}
		
		
		
	int[][] matrizBinaria = new int[numLinhas][numColunas];

	for (int i = 0; i < numLinhas; i++) {
		
		for (int j = 0; j < numColunas; j++) {
			System.out.println("Entre com um valor entre 0 e 1 para preencher a matriz de linha " 
		    + (i) + " e coluna "+(j));
			
			matrizBinaria[i][j] = sc.nextInt();
		}
	}


		
		
		
	sc.close();
	
	}}
	
	/*		

for (int i = 0; i < numLinhas; i++) {
	for (int j = 0; j < numColunas; j++) {
		System.out.print(matrizBinaria[i][j]);
	}
	System.out.println();
}
*/	



