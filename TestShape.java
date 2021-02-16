package Interface;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polygon p = new Square();
		p.calcArea(15);
		p.calcPeri(12);
		Polygon p1=new Rectangle();
		p1.calcArea(10,15);
		p1.calcPeri(30, 40);
		

	}

}
