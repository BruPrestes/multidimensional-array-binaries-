package forms.rectangle;

import java.util.Scanner;

public class PrintValues {

	public static void Imprimir() {

		Scanner sc = new Scanner(System.in);
		int aux = 999;
		/*
		 * int[][] m = { { (Integer)null, (Integer)null, (Integer)null, (Integer)null,
		 * (Integer)null }, { (Integer)null, (Integer)null, (Integer)null,
		 * (Integer)null, (Integer)null }, { (Integer)null, (Integer)null, (Integer)
		 * null, (Integer)null, (Integer)null }, { (Integer)null, (Integer)null,
		 * (Integer)null, (Integer)null, (Integer)null } };
		 */
		/* ********** Linhas ******************* */

		int[][] m = new int[4][5];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				/*
				 * System.out.println("       _C0_C1_C2_C3_C4_");
				 * System.out.println("Linha 0|__|__|__|__|__|");
				 * System.out.println("Linha 1|__|__|__|__|__|");
				 * System.out.println("Linha 2|__|__|__|__|__|");
				 * System.out.println("Linha 3|__|__|__|__|__|");
				 */
				if (aux == 999) {
					System.out.println("Entre com um valor entre 0 e 1 para preencher a matriz de linha " + (i)
							+ " e coluna " + (j));
					System.out.println("       _C0_C1_C2_C3_C4_");
					System.out.println("Linha 0|__|__|__|__|__|");
					System.out.println("Linha 1|__|__|__|__|__|");
					System.out.println("Linha 2|__|__|__|__|__|");
					System.out.println("Linha 3|__|__|__|__|__|");
				}

				System.out.println(
						"Entre com um valor entre 0 e 1 para preencher a matriz de linha " + (i) + " e coluna " + (j));

				// m[i][j] =

				aux = sc.nextInt();
				if (aux != 0 && aux != 1) {

					while (aux != 0 && aux != 1) {
						if (aux != 0 && aux != 1) {
							System.out.println("digite correto");

							System.out.println("Entre com um valor entre 0 e 1 para preencher a matriz de linha " + (i)
									+ " e coluna " + (j));

							aux = sc.nextInt();

							
						}
						if (aux == 0) {
							m[i][j] = (int) aux;
						}else if (aux == 1) {
							m[i][j] = (int) aux;
						}
					}

				} else {
					m[i][j] = (int) aux;
					if (i == 0 && j == 0) {

						;
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|_|_|_|_|");
						System.out.println("Linha 1|_|_|_|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");

					}
					if (i == 0 && j == 1) {

						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|_|_|_|");
						System.out.println("Linha 1|_|_|_|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");

					}

					if (i == 0 && j == 2) {

						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|_|_|");
						System.out.println("Linha 1|_|_|_|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");

					}

					if (i == 0 && j == 3) {

						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out
								.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|_|");
						System.out.println("Linha 1|_|_|_|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");

					}

					if (i == 0 && j == 4) {

						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|_|_|_|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");

					}

					/// Linha1//////////////////////////////////////

					if (i == 1 && j == 0) {

						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|_|_|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");

					}
					if (i == 1 && j == 1) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|_|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					if (i == 1 && j == 2) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|_|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					if (i == 1 && j == 3) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out
								.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|_|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					if (i == 1 && j == 4) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|_|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					/// Linha2//////////////////////////////////////
					if (i == 2 && j == 0) {

						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|_|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					if (i == 2 && j == 1) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|_|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					if (i == 2 && j == 2) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|_|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					if (i == 2 && j == 3) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out
								.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|" + m[2][3] + "|_|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					if (i == 2 && j == 4) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|" + m[2][3] + "|"
								+ m[2][4] + "|");
						System.out.println("Linha 3|_|_|_|_|_|");
					}
					/// Linha3//////////////////////////////////////
					if (i == 3 && j == 0) {

						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|" + m[2][3] + "|"
								+ m[2][4] + "|");
						System.out.println("Linha 3|" + m[3][0] + "|_|_|_|_|");
					}
					if (i == 3 && j == 1) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|" + m[2][3] + "|"
								+ m[2][4] + "|");
						System.out.println("Linha 3|" + m[3][0] + "|" + m[3][1] + "|_|_|_|");
					}
					if (i == 3 && j == 2) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|" + m[2][3] + "|"
								+ m[2][4] + "|");
						System.out.println("Linha 3|" + m[3][0] + "|" + m[3][1] + "|" + m[3][2] + "|_|_|");
					}
					if (i == 3 && j == 3) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|" + m[2][3] + "|"
								+ m[2][4] + "|");
						System.out
								.println("Linha 3|" + m[3][0] + "|" + m[3][1] + "|" + m[3][2] + "|" + m[3][3] + "|_|");
					}
					if (i == 3 && j == 4) {
						System.out.print("Coluna");
						System.out.println("  0 1 2 3 4");
						System.out.println("Linha 0|" + m[0][0] + "|" + m[0][1] + "|" + m[0][2] + "|" + m[0][3] + "|"
								+ m[0][4] + "|");
						System.out.println("Linha 1|" + m[1][0] + "|" + m[1][1] + "|" + m[1][2] + "|" + m[1][3] + "|"
								+ m[1][4] + "|");
						System.out.println("Linha 2|" + m[2][0] + "|" + m[2][1] + "|" + m[2][2] + "|" + m[2][3] + "|"
								+ m[2][4] + "|");
						System.out.println("Linha 3|" + m[3][0] + "|" + m[3][1] + "|" + m[3][2] + "|" + m[3][3] + "|"
								+ m[3][4] + "|");
					}

				}

			}

			/*
			 * else { m[i][j] = aux; if(m[i][j] == 0 && m[i][j] ==1)
			 * 
			 * 
			 * 
			 * System.out.print("Coluna"); System.out.println("  0 1 2 3 4");
			 * System.out.println("Linha 0|"+ m[0][0]+"|"+ m[0][1]+"|"+ m[0][2]+"|"+
			 * m[0][3]+"|"+ m[0][4]+"|"); System.out.println("Linha 1|_|_|_|_|_|");
			 * System.out.println("Linha 2|_|_|_|_|_|");
			 * System.out.println("Linha 3|_|_|_|_|_|"); }
			 */
			// if(m[0][0] == 0 && m[0][0] == 1){}

		}

		RectangleVariants rv = new RectangleVariants();
		rv.RectangleVariantFinder(m);
	}
}