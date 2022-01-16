package forms.rectangle;

import java.util.ArrayList;
import java.util.List;

public class RectangleVariants extends RectangleFinder {


	
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
	
	//novas variantes
	
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
		*/
		//Adicionando retângulos da RectangleFinder nas variantes
		boolean variant1 = 
				   a == 1 
	    		&& b == 1
	    		&& g == 1
				&& f == 1;
		
		boolean variant2 =  
		           b == 1 
				&& c == 1
				&& h == 1 
				&& g == 1;
		
		boolean variant3 =
				c == 1 
				&& d == 1
				&& i == 1 
				&& h == 1;
		
		boolean variant4 = d == 1 
				&& e == 1
				&& j == 1 
				&& i == 1;
		
		boolean variant5 = f == 1 
				&& g == 1
				&& l == 1 
				&& k == 1;
		
		boolean variant6 = g == 1 
				&& h == 1
				&& m == 1 
				&& l == 1;
				
		boolean variant7 = h == 1 
				&& i == 1
				&& n == 1 
				&& m == 1;
		
		boolean variant8 = i == 1 
				&& j == 1
				&& o == 1 
				&& n == 1;
		
		boolean variant9 = k == 1 
				&& l == 1
				&& q == 1 
				&& p == 1;
		
		boolean variant10 = l == 1 
				&& m == 1
				&& r == 1 
				&& q == 1;
		
        boolean variant11 = m == 1 
				&& n == 1
				&& s == 1 
				&& r == 1;
        
        boolean variant12 = n == 1 
        		&& o == 1
        		&& t == 1
				&& s == 1; 
        
   

		if(variant1 == true) {
			variante1 = 4;
			variantes.add(variante1);
		}
		if(variant2 == true) {
			variante2 = 4;
			variantes.add(variante2);
		}
		if(variant3 == true) {
			variante3 = 4;
			variantes.add(variante3);
		}
		if(variant4 == true) {
			variante4 = 4;
			variantes.add(variante4);
		}
		if(variant5 == true) {
			variante5 = 4;
			variantes.add(variante5);
		}
		if(variant6 == true) {
			variante6 = 4;
			variantes.add(variante6);
		}
		if(variant7 == true) {
			variante7 = 4;
			variantes.add(variante7);
		}
		if(variant8 == true) {
			variante8 = 4;
			variantes.add(variante8);
		}
		if(variant9 == true) {
			variante9 = 4;
			variantes.add(variante9);
		}
		if(variant10 == true) {
			variante10 = 4;
			variantes.add(variante10);
		}
		if(variant11 == true) {
			variante11 = 4;
			variantes.add(variante11);
		}
		if(variant12 == true) {
			variante12 = 4;
			variantes.add(variante12);
			//System.out.println(variantes);
			///System.out.println(variant13);
		}
		

		
		//Novas variantes
		
		if(variante1 == 4 && variante2 == 4) {
			variante13 = 6;
			variantes.add(variante13);
			
		}
		
		if(variante1 == 4 && variante2 == 4 && variante3 == 4) {
			variante14 = 8;
			variantes.add(variante14);
			
		}
		
		if(variante1 == 4 && variante2 == 4 && variante3 == 4 && variante4 == 4) {
			variante15 = 10;
			variantes.add(variante15);
			
		}
		
		System.out.println(variantes);
	}
	
	
 public boolean isQuad (int x) {
		 
		 if(x == 4) {
			 return true;
		 }else {
			 return false;
		 }
		 
	 }
	
}
