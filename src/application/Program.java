package application;

import forms.rectangle.Strings;
import forms.rectangle.RectangleFinder;
public class Program {

	public static void main(String[] args) {


		int[][] matrizBinaria =  { {1, 1, 1, 1, 0},
				                   {1, 1, 1, 1, 1},
				                   {1, 0, 1, 1, 1},
				                   {1, 0, 0, 1, 0} };
		
		
		

		//RectangleFinder rect = new RectangleFinder();
		//rect.RectangleFinderCalculator(matrizBinaria);
		
		RectangleFinder rect = new RectangleFinder();
		rect.FinderCalculator(matrizBinaria);
		
		Strings st = new Strings();
		System.out.println(st.getStringVariant1());
	}
	
	
	}





















