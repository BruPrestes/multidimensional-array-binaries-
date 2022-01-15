package forms;

import forms.rectangle.Rectangle;
import forms.triangle.Triangle;

public abstract class GeometricForms {
	
	private Rectangle rect;
	private Triangle tri;
	
	public void FinderCalculator(int C[][]) {
		
	}

	public Rectangle getRect() {
		return rect;
	}

	public void setRect(Rectangle rect) {
		this.rect = rect;
	}

	public Triangle getTri() {
		return tri;
	}

	public void setTri(Triangle tri) {
		this.tri = tri;
	}
}
