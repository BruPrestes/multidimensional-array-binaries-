package forms.rectangle;

import java.util.Scanner;

public class PrintValues {

public static void Imprimir() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		/*int[][] m = { { (Integer)null, (Integer)null, (Integer)null, (Integer)null, (Integer)null },
		{ (Integer)null, (Integer)null, (Integer)null, (Integer)null, (Integer)null },
		{ (Integer)null, (Integer)null, (Integer) null, (Integer)null, (Integer)null },
		{ (Integer)null, (Integer)null, (Integer)null, (Integer)null, (Integer)null } }; 
*/
		/* ********** Linhas ******************* */

		int[][] m = new int[4][5];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {
	
				/*System.out.println("       _C0_C1_C2_C3_C4_");
				System.out.println("Linha 0|__|__|__|__|__|");
				System.out.println("Linha 1|__|__|__|__|__|");
				System.out.println("Linha 2|__|__|__|__|__|");
				System.out.println("Linha 3|__|__|__|__|__|");*/
				System.out.println(
						"Entre com um valor entre 0 e 1 para preencher a matriz de linha " + (i) + " e coluna " + (j));

				// m[i][j] =
				int aux = sc.nextInt();
				if (aux != 0 && aux != 1) {
					
					while (aux != 0 && aux != 1) {
						if (aux != 0 && aux != 1) {
							System.out.println("digite correto");

							System.out.println("Entre com um valor entre 0 e 1 para preencher a matriz de linha " + (i)
									+ " e coluna " + (j));

							aux = sc.nextInt();

						}
					}

				} else {
					m[i][j] = aux;
					if(m[i][j] == 0 && m[i][j] ==1)
					
	
					
					System.out.print("Coluna");
					System.out.println("  0 1 2 3 4");
					System.out.println("Linha 0|"+ m[0][0]+"|"+ m[0][1]+"|"+ m[0][2]+"|"+ m[0][3]+"|"+ m[0][4]+"|");
					System.out.println("Linha 1|_|_|_|_|_|");
					System.out.println("Linha 2|_|_|_|_|_|");
					System.out.println("Linha 3|_|_|_|_|_|");
				}
				//if(m[0][0] == 0 && m[0][0] == 1){}
		}
		
		RectangleVariants rv = new RectangleVariants();
		rv.RectangleVariantFinder(m);
	}
}}
