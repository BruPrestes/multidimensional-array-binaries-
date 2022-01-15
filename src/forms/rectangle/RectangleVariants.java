package forms.rectangle;

import java.util.ArrayList;
import java.util.List;

public class RectangleVariants extends RectangleFinder {

	List<Integer> variants = new ArrayList<>();
	
	int variant1 = retangulo1;
	int variant2 = retangulo2;
	int variant3 = retangulo3;
	int variant4 = retangulo4;
	int variant5 = retangulo5;
	int variant6 = retangulo6;
	int variant7 = retangulo7;
	int variant8 = retangulo8;
	int variant9 = retangulo9;
	int variant10 = retangulo10;
	int variant11 = retangulo11;
	int variant12 = retangulo12;
	
	int variant100;
	
	public void RectangleVariantFinder() {

		//Adicionando retângulos da RectangleFinder nas variantes
		
		if(isQuad(retangulo1)) {
			variants.add(variant1);
		}
		if(isQuad(retangulo2)) {
			variants.add(variant2);
		}
		if(isQuad(retangulo3)) {
			variants.add(variant3);
		}
		if(isQuad(retangulo4)) {
			variants.add(variant4);
		}
		if(isQuad(retangulo5)) {
			variants.add(variant5);
		}
		if(isQuad(retangulo6)) {
			variants.add(variant6);
		}
		if(isQuad(retangulo7)) {
			variants.add(variant7);
		}
		if(isQuad(retangulo8)) {
			variants.add(variant8);
		}
		if(isQuad(retangulo9)) {
			variants.add(variant9);
		}
		if(isQuad(retangulo11)) {
			variants.add(variant11);
		}
		if(isQuad(retangulo12)) {
			variants.add(variant12);
		}

		
		//Novas variantes
		
		if(isQuad(retangulo1) &&  isQuad(retangulo2)) {
			variant100 = retangulo1 + retangulo2 - 2;
			variants.add(variant100);
		}
		
		
	}
	
}
