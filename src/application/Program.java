package application;

public class Program {

	public static void main(String[] args) {


		int[][] matrizBinaria =  { {1, 1, 1, 1, 0},
				                   {1, 1, 1, 1, 1},
				                   {1, 0, 1, 1, 1},
				                   {1, 0, 0, 1, 0} };
		
		
		

		RectangleFinder rect = new RectangleFinder();
		rect.RectangleFinderCalculator(matrizBinaria);
		
	}
	
	
	}





















