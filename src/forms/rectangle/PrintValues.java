package forms.rectangle;

import java.util.Scanner;

public class PrintValues {

public static void Imprimir() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// int[][] matrizBinaria = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1,
		// 1 }, { 1, 1, 1, 1, 1 } };

		/* ********** Linhas ******************* */

		int[][] matrizBinaria = new int[4][5];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.println(
						"Entre com um valor entre 0 e 1 para preencher a matriz de linha " + (i) + " e coluna " + (j));

				// matrizBinaria[i][j] =
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
					matrizBinaria[i][j] = aux;
				}

			}
		}
		
		RectangleVariants rv = new RectangleVariants();
		rv.RectangleVariantFinder(matrizBinaria);
	}
}
