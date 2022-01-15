package application;

import java.util.ArrayList;
import java.util.List;

public class RectangleVariants extends RectangleFinder {

	List<Integer> variants = new ArrayList<>();
	int variant1;
	
	public void RectangleVariantFinder() {
		
		System.out.println(retangulos);
		
		if(isQuad(retangulo1) &&  isQuad(retangulo2)) {
			variant1 = retangulo1 + retangulo2 - 2;
			variants.add(variant1);
		}
		
		
	}
	
}
