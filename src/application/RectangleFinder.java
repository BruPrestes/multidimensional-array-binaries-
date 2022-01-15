package application;

import java.util.ArrayList;
import java.util.List;

public class RectangleFinder {

	private int[][] C = new int[4][5];
 	
	List<Integer> retangulos = new ArrayList<>();
	int primeiroretangulo;
	int retangulo1;
	int retangulo2;
	int retangulo3;
	int retangulo4;
	int retangulo5;
	int retangulo6;
	int retangulo7;
	int retangulo8;
	int retangulo9;
	int retangulo10;
	int retangulo11;
	int retangulo12;
	int retangulo13;
	int retangulo14;
	int retangulo15;
	int retangulo16;
	int retangulo17;
	int retangulo18;
	int retangulo19;
	int retangulo20;
	
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
	
	
	
	public void RectangleFinderCalculator(int C[][]) {
		
		a = C[0][0];
		b = C[0][1];
		c = C[0][2];
		d = C[0][3];
		e = C[0][4];
		f = C[1][0];
		g = C[1][1];
		h = C[1][2];
		i = C[1][3];
		j = C[1][4];
		k = C[2][0];
		l = C[2][1];
		m = C[2][2];
		n = C[2][3];
		o = C[2][4];
		p = C[3][0];
		k = C[3][1];
		r = C[3][2];
		s = C[3][3];
		t = C[3][4];
		
		
		//RETÂNGULOS LINHA 0 E 1
		

	            	if (a == 1 
	            		&& b == 1
	            		&& g == 1
						&& f == 1) {
	            		
	            		retangulo1 = 4;
	            		
	            		if(isQuad(retangulo1) == true) {
	            			retangulos.add(retangulo1);
	            		}
	            		
					} if (b == 1 
							&& c == 1
							&& h == 1 
							&& g == 1) {
						
	            		retangulo2 = 4;
	            		retangulos.add(retangulo2);		
					}
					
					if (c == 1 
							&& d == 1
							&& i == 1 
							&& h == 1) {
						
	            		retangulo3 = 4;
	            		retangulos.add(retangulo3);
	        	}
					
					if (d == 1 
							&& e == 1
							&& j == 1 
							&& i == 1) {
						
	            		retangulo4 = 4;
	            		retangulos.add(retangulo4);

					}
					
			//RETÂNGULOS LINHA 1 E 2	
					
					if (f == 1 
							&& g == 1
							&& l == 1 
							&& k == 1) {
						
	            		retangulo5 = 4;
	            		retangulos.add(retangulo5);
	            		
					}
					
					if (g == 1 
							&& h == 1
							&& m == 1 
							&& l == 1) {
						
	            		retangulo6 = 4;
	            		retangulos.add(retangulo6);

					}
					
					if (l == 1 
							&& i == 1
							&& n == 1 
							&& m == 1) {
						
	            		retangulo7 = 4;
	            		retangulos.add(retangulo7);

					}
					
					if (i == 1 
							&& j == 1
							&& o == 1 
							&& n == 1) {
						
	            		retangulo8 = 4;
	            		retangulos.add(retangulo8);

					}
					
			//RETÂNGULOS LINHA 2 E 3	
	    
					if (k == 1 
							&& l == 1
							&& q == 1 
							&& p == 1) {
						
	            		retangulo9 = 4;
	            		retangulos.add(retangulo9);

					}
					
					if (l == 1 
							&& m == 1
							&& r == 1 
							&& q == 1) {
						
	            		retangulo10 = 4;
	            		retangulos.add(retangulo10);

					}
					
					if (m == 1 
							&& n == 1
							&& s == 1 
							&& r == 1) {
						
	            		retangulo11 = 4;
	            		retangulos.add(retangulo11);

					}
					
					if (n == 1 
							&& o == 1
							&& t == 1 
							&& s == 1) {
						
	            		retangulo12 = 4;
	            		retangulos.add(retangulo12);

					}
					
					System.out.println(retangulos);
	}	
		
	
	 public boolean isQuad (int x) {
		 
		 if(x == 4) {
			 return true;
		 }else {
			 return false;
		 }
		 
	 }
	



	

}