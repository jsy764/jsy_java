package testMain;

public abstract class Shape {
	protected int width;
	protected int height;
	
	public Shape() {}
	protected Shape(int w, int h) {
		this.width=w;
		this.height=h;
	}
	public abstract void draw();
	
}
