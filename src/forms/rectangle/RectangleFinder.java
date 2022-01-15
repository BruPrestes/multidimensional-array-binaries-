package forms.rectangle;

import java.util.ArrayList;
import java.util.List;

import forms.GeometricForms;

public class RectangleFinder extends GeometricForms{

	//private int[][] C = new int[4][5];
 	
	List<Integer> retangulos = new ArrayList<>();

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
	
	
	
	public int a; 
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

	private String letraA = "[0][0]\n";
	private String letrab = "[0][1]\n";
	private String letrac = "[0][2]\n";
	private String letrad = "[0][3]\n";
	private String letrae = "[0][4]\n";
	private String letraf = "[1][0]\n";
	private String letrag = "[1][1]\n";
	private String letrah = "[1][2]\n";
	private String letrai = "[1][3]\n";
	private String letraj = "[1][4]\n";
	private String letrak = "[2][0]\n";
	private String letral = "[2][1]\n";
	private String letram = "[2][2]\n";
	private String letran = "[2][3]\n";
	private String letrao = "[2][4]\n";
	private String letrap = "[3][0]\n";
	private String letraq = "[3][1]\n";
	private String letrar = "[3][2]\n";
	private String letras = "[3][3]\n";
	private String letrat = "[3][4]\n";
	
	
	
	public String getLetraA() {
		return letraA;
	}




	public void setLetraA(String letraA) {
		this.letraA = letraA;
	}




	public String getLetrab() {
		return letrab;
	}




	public void setLetrab(String letrab) {
		this.letrab = letrab;
	}




	public String getLetrac() {
		return letrac;
	}




	public void setLetrac(String letrac) {
		this.letrac = letrac;
	}




	public String getLetrad() {
		return letrad;
	}




	public void setLetrad(String letrad) {
		this.letrad = letrad;
	}




	public String getLetrae() {
		return letrae;
	}




	public void setLetrae(String letrae) {
		this.letrae = letrae;
	}




	public String getLetraf() {
		return letraf;
	}




	public void setLetraf(String letraf) {
		this.letraf = letraf;
	}




	public String getLetrag() {
		return letrag;
	}




	public void setLetrag(String letrag) {
		this.letrag = letrag;
	}




	public String getLetrah() {
		return letrah;
	}




	public void setLetrah(String letrah) {
		this.letrah = letrah;
	}




	public String getLetrai() {
		return letrai;
	}




	public void setLetrai(String letrai) {
		this.letrai = letrai;
	}




	public String getLetraj() {
		return letraj;
	}




	public void setLetraj(String letraj) {
		this.letraj = letraj;
	}




	public String getLetrak() {
		return letrak;
	}




	public void setLetrak(String letrak) {
		this.letrak = letrak;
	}




	public String getLetral() {
		return letral;
	}




	public void setLetral(String letral) {
		this.letral = letral;
	}




	public String getLetran() {
		return letran;
	}




	public void setLetran(String letran) {
		this.letran = letran;
	}




	public String getLetram() {
		return letram;
	}




	public void setLetram(String letram) {
		this.letram = letram;
	}




	public String getLetrao() {
		return letrao;
	}




	public void setLetrao(String letrao) {
		this.letrao = letrao;
	}




	public String getLetrap() {
		return letrap;
	}




	public void setLetrap(String letrap) {
		this.letrap = letrap;
	}




	public String getLetraq() {
		return letraq;
	}




	public void setLetraq(String letraq) {
		this.letraq = letraq;
	}




	public String getLetrar() {
		return letrar;
	}




	public void setLetrar(String letrar) {
		this.letrar = letrar;
	}




	public String getLetras() {
		return letras;
	}




	public void setLetras(String letras) {
		this.letras = letras;
	}




	public String getLetrat() {
		return letrat;
	}




	public void setLetrat(String letrat) {
		this.letrat = letrat;
	}




	public void FinderCalculator(int C[][]) {
		
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
					
					if (h == 1 
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