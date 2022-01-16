package forms.rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class RectangleVariants extends RectangleFinder {

	Strings sg = new Strings();

	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int g;
	int h;
	int i;
	int j;
	int k;
	int l;
	int m;
	int n;
	int o;
	int p;
	int q;
	int r;
	int s;
	int t;

	int variante1;
	int variante2;
	int variante3;
	int variante4;
	int variante5;
	int variante6;
	int variante7;
	int variante8;
	int variante9;
	int variante10;
	int variante11;
	int variante12;

	// novas variantes

	int variante13;
	int variante14;
	int variante15;
	int variante16;
	int variante17;
	int variante18;
	int variante19;
	int variante20;
	int variante21;
	int variante22;
	int variante23;
	int variante24;
	int variante25;
	int variante26;
	int variante27;
	int variante28;
	int variante29;
	int variante30;
	int variante31;
	int variante32;
	int variante33;
	int variante34;
	int variante35;
	int variante36;
	int variante37;
	int variante38;
	int variante39;
	int variante40;
	int variante41;
	int variante42;
	int variante43;
	int variante44;
	int variante45;
	int variante46;
	int variante47;
	int variante48;
	int variante49;
	int variante50;
	int variante51;
	int variante52;
	int variante53;
	int variante54;
	int variante55;
	int variante56;
	int variante57;
	int variante58;
	int variante59;
	int variante60;

	public void RectangleVariantFinder(int C[][]) {

		int a = C[0][0];
		int b = C[0][1];
		int c = C[0][2];
		int d = C[0][3];
		int e = C[0][4];
		int f = C[1][0];
		int g = C[1][1];
		int h = C[1][2];
		int i = C[1][3];
		int j = C[1][4];
		int k = C[2][0];
		int l = C[2][1];
		int m = C[2][2];
		int n = C[2][3];
		int o = C[2][4];
		int p = C[3][0];
		int q = C[3][1];
		int r = C[3][2];
		int s = C[3][3];
		int t = C[3][4];

		List<Integer> variantes = new ArrayList<>();

		/*
		 * a = C[0][0]; b = C[0][1]; c = C[0][2]; d = C[0][3]; e = C[0][4]; f = C[1][0];
		 * g = C[1][1]; h = C[1][2]; i = C[1][3]; j = C[1][4]; k = C[2][0]; l = C[2][1];
		 * m = C[2][2]; n = C[2][3]; o = C[2][4]; p = C[3][0]; k = C[3][1]; r = C[3][2];
		 * s = C[3][3]; t = C[3][4];
		 */
		// Adicionando retângulos da RectangleFinder nas variantes
		boolean variant1 = a == 1 && b == 1 && g == 1 && f == 1;

		boolean variant2 = b == 1 && c == 1 && h == 1 && g == 1;

		boolean variant3 = c == 1 && d == 1 && i == 1 && h == 1;

		boolean variant4 = d == 1 && e == 1 && j == 1 && i == 1;

		boolean variant5 = f == 1 && g == 1 && l == 1 && k == 1;

		boolean variant6 = g == 1 && h == 1 && m == 1 && l == 1;

		boolean variant7 = h == 1 && i == 1 && n == 1 && m == 1;

		boolean variant8 = i == 1 && j == 1 && o == 1 && n == 1;

		boolean variant9 = k == 1 && l == 1 && q == 1 && p == 1;

		boolean variant10 = l == 1 && m == 1 && r == 1 && q == 1;

		boolean variant11 = m == 1 && n == 1 && s == 1 && r == 1;

		boolean variant12 = n == 1 && o == 1 && t == 1 && s == 1;
		
		/////////////////////////////////////////////////////////
		
		boolean variant38 = a == 1 && f == 1 && k == 1 && p == 1;
		
		boolean variant39 = b == 1 && g == 1 && l == 1 && q == 1;

		boolean variant40 = c == 1 && h == 1 && m == 1 && r == 1;
		
		boolean variant41 = d == 1 && i == 1 && n == 1 && s == 1;
		
		boolean variant42 = e == 1 && j == 1 && o == 1 && t == 1;

		boolean var38 = a == 1 && b == 1 && f == 1 && g == 1 && k == 1 && l == 1;
		
		boolean var39 = a == 1 && b == 1 && f == 1 && g == 1 && k == 1 && l == 1
				&& c == 1 && h == 1 && m == 1;
		
		boolean var40 = a == 1 && b == 1 && f == 1 && g == 1 && k == 1 && l == 1
				&& c == 1 && h == 1 && m == 1
				&& d == 1 && i == 1 && n == 1;
		
		boolean var41 = a == 1 && b == 1 && f == 1 && g == 1 && k == 1 && l == 1
				&& c == 1 && h == 1 && m == 1
				&& d == 1 && i == 1 && n == 1
				&& e == 1 && j == 1 && o == 1;
		
		boolean var42 = d == 1 && e == 1 && i == 1 && j == 1 && n == 1 && o == 1;
		
		boolean var43 = d == 1 && e == 1 && i == 1 && j == 1 && n == 1 && o == 1
				&& c == 1 && h == 1 && m == 1;
		
		boolean var44 = a == 1 && e == 1 && i == 1 && j == 1 && n == 1 && o == 1
				&& c == 1 && h == 1 && m == 1
				&& b == 1 && g == 1 && l == 1;
		
		boolean var45 = f == 1 && g == 1 && k == 1 && l == 1 && p == 1 && q == 1;
		
		boolean var46 = g == 1 && h == 1 && l == 1 && m == 1 && q == 1 && r == 1;
		
		boolean var47 = h == 1 && i == 1 && m == 1 && n == 1 && r == 1 && s == 1;
		
		boolean var48 = i == 1 && j == 1 && n == 1 && o == 1 && s == 1 && t == 1;
		
		boolean var49 = b == 1 && c == 1 && d == 1 && g == 1 && h == 1 && i == 1
				&& l == 1 && m == 1 && n == 1;
		
		boolean var50 = a == 1 && b == 1 && c == 1 && f == 1 && g == 1 && h == 1
				&& k == 1 && l == 1 && m == 1;
		
		boolean var51 = f == 1 && g == 1 && k == 1 && l == 1 && p == 1 && q == 1
				&& g == 1 && h == 1 && l == 1 && m == 1 && q == 1 && r == 1;
		
		boolean var52 = f == 1 && g == 1 && k == 1 && l == 1 && p == 1 && q == 1
				&& g == 1 && h == 1 && l == 1 && m == 1 && q == 1 && r == 1
				&& h == 1 && i == 1 && m == 1 && n == 1 && r == 1 && s == 1;
		
		boolean var53 = var52 && var48;
		
		boolean var54 = var48 && var47;
		
		boolean var55 = var54 && var46;
		
		
		
		if (variant1 == true) {
			variante1 = 4;
			variantes.add(variante1);
		}
		if (variant2 == true) {
			variante2 = 4;
			variantes.add(variante2);
		}
		if (variant3 == true) {
			variante3 = 4;
			variantes.add(variante3);
		}
		if (variant4 == true) {
			variante4 = 4;
			variantes.add(variante4);
		}
		if (variant5 == true) {
			variante5 = 4;
			variantes.add(variante5);
		}
		if (variant6 == true) {
			variante6 = 4;
			variantes.add(variante6);
		}
		if (variant7 == true) {
			variante7 = 4;
			variantes.add(variante7);
		}
		if (variant8 == true) {
			variante8 = 4;
			variantes.add(variante8);
		}
		if (variant9 == true) {
			variante9 = 4;
			variantes.add(variante9);
		}
		if (variant10 == true) {
			variante10 = 4;
			variantes.add(variante10);
		}
		if (variant11 == true) {
			variante11 = 4;
			variantes.add(variante11);
		}
		if (variant12 == true) {
			variante12 = 4;
			variantes.add(variante12);
			// System.out.println(variantes);
			/// System.out.println(variant13);
		}

		// Novas variantes

		if (variante1 == 4 && variante2 == 4) {
			variante13 = 6;
			variantes.add(variante13);

		}

		if (variante1 == 4 && variante2 == 4 && variante3 == 4) {
			variante14 = 8;
			variantes.add(variante14);

		}

		if (variante1 == 4 && variante2 == 4 && variante3 == 4 && variante4 == 4) {
			variante15 = 10;
			variantes.add(variante15);

		}

		if (variante3 == 4 && variante4 == 4) {
			variante16 = 6;
			variantes.add(variante16);

		}

		if (variante2 == 4 && variante3 == 4 && variante4 == 4) {
			variante17 = 8;
			variantes.add(variante17);
			// System.out.println("Variante 17: \n" + sg.getStringVariant17());
		}

		/////////////////////////////////////////////////////////////////////////////////

		// Variante 18
		if (variante5 == 4 && variante6 == 4) {
			variante18 = 6;
			variantes.add(variante18);

		}

		if (variante5 == 4 && variante6 == 4 && variante7 == 4) {
			variante19 = 8;
			variantes.add(variante19);

		}

		if (variante5 == 4 && variante6 == 4 && variante7 == 4 && variante8 == 4) {
			variante20 = 10;
			variantes.add(variante20);

		}

		if (variante7 == 4 && variante8 == 4) {
			variante21 = 6;
			variantes.add(variante21);

		}

		if (variante6 == 4 && variante7 == 4 && variante8 == 4) {
			variante22 = 8;

			variantes.add(variante22);

		}

		if (variante9 == 4 && variante10 == 4) {
			variante23 = 6;

			variantes.add(variante23);

		}

		if (variante9 == 4 && variante10 == 4 && variante11 == 4) {
			variante24 = 8;

			variantes.add(variante24);

		}

		if (variante9 == 4 && variante10 == 4 && variante11 == 4 && variante12 == 4) {
			variante25 = 10;

			variantes.add(variante25);

		}

		if (variante11 == 4 && variante12 == 4) {
			variante26 = 6;

			variantes.add(variante26);

		}

		if (variante10 == 4 && variante11 == 4 && variante12 == 4) {
			variante27 = 8;

			variantes.add(variante27);

		}

		if (variante1 == 4 && variante9 == 4) {
			variante28 = 8;

			variantes.add(variante28);

		}

		if (variante2 == 4 && variante10 == 4) {
			variante29 = 8;

			variantes.add(variante29);

		}

		if (variante3 == 4 && variante11 == 4) {
			variante30 = 8;

			variantes.add(variante30);

		}

		if (variante4 == 4 && variante12 == 4) {
			variante31 = 8;

			variantes.add(variante31);

		}

		////////////////////////////////////////////////////////

		if (variante1 == 4 && variante9 == 4 && variante2 == 4 && variante10 == 4) {
			variante32 = 12;

			variantes.add(variante32);

		}

		if (variante1 == 4 && variante9 == 4 && variante2 == 4 && variante10 == 4 && variante3 == 4
				&& variante11 == 4) {
			variante33 = 16;

			variantes.add(variante33);

		}

		if (variante1 == 4 && variante9 == 4 && variante2 == 4 && variante10 == 4 && variante3 == 4 && variante11 == 4
				&& variante4 == 4 && variante12 == 4) {
			variante34 = 20;

			variantes.add(variante34);

		}

		if (variante3 == 4 && variante11 == 4 && variante4 == 4 && variante12 == 4) {
			variante35 = 12;

			variantes.add(variante35);

		}

		///////////////////////////////////////////////////////

		if (variante3 == 4 && variante11 == 4 && variante4 == 4 && variante12 == 4 && variante2 == 4
				&& variante10 == 4) {
			variante36 = 16;

			variantes.add(variante36);

		}

		if (variante2 == 4 && variante10 == 4 && variante3 == 4 && variante11 == 4) {
			variante37 = 12;

			variantes.add(variante37);

		}
		
		///////////////////////////////////////////////////////////////////
		
		
		
		////////////////////////////////////////////////////////////////

		if (var38 == true) {
			variante38 = 6;
			variantes.add(variante38);
		}
		if (var39 == true) {
			variante39 = 9;
			variantes.add(variante39);
		}
		if (var40 == true) {
			variante40 = 12;
			variantes.add(variante40);
		}
		if (var41 == true) {
			variante41 = 15;
			variantes.add(variante41);
		}
		if (var42 == true) {
			variante42 = 6;
			variantes.add(variante42);
		}
		if (var43 == true) {
			variante43 = 9;
			variantes.add(variante43);
		}
		if (var44 == true) {
			variante44 = 12;
			variantes.add(variante44);
		}
////////////////////////////////////////////////////////////////////////////////
			

			if (var45 == true) {
				variante45 = 6;
				variantes.add(variante45);
			}
			if (var46 == true) {
				variante46 = 6;
				variantes.add(variante46);
			}
			if (var47 == true) {
				variante47 = 6;
				variantes.add(variante47);
			}
			if (var48 == true) {
				variante48 = 6;
				variantes.add(variante48);
			}
			if (var49 == true) {
				variante49 = 9;
				variantes.add(variante49);
			}
			if (var50 == true) {
				variante50 = 9;
				variantes.add(variante50);
			}
			if (var51 == true) {
				variante51 = 9;
				variantes.add(variante51);
			}
			if (var52 == true) {
				variante52 = 12;
				variantes.add(variante52);
			}
			if (var53 == true) {
				variante53 = 15;
				variantes.add(variante53);
			}
			if (var54 == true) {
				variante54 = 9;
				variantes.add(variante54);
			}
			if (var55 == true) {
				variante55 = 12;
				variantes.add(variante55);
			}
			
		Integer max = variantes.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);

		Integer min = variantes.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);

		for (int u = 0; u < 4; u++) {
			for (int u2 = 0; u2 < 5; u2++) {
				System.out.print(C[u][u2] + " ");
			}
			System.out.println(" ");
		}

		System.out.println();
		// System.out.println("Todos os elementos abaixo são retângulos" + variantes);
		System.out.println("O quadrado de maior área tem tamanho igual a: " + max);
		System.out.println();
		System.out.println("O quadrado de menor área tem tamanho igual a: " + min);

	}

	public boolean isQuad(int x) {

		if (x == 4) {
			return true;
		} else {
			return false;
		}

	}

}
	

