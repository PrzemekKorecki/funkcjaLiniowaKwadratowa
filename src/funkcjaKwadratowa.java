
public class funkcjaKwadratowa extends funkcjaLiniowa{
	private int c;

	public funkcjaKwadratowa(int a, int b, int c) {
		super(a, b);
		this.c = c;
		// TODO Auto-generated constructor stub
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	void wypisz() {
		System.out.println("Wzor rownania kwadratowego f(x)= "+getA()+"x2 + "+getB()+"x + "+c);
	}
	int ileMiejscZerowych() {
		
		double delta = getB()*getB() - 4*getA()*c;
		int x;
		if(delta > 0) x=2;
		if(delta < 0) x= Integer.MAX_VALUE;
		else x=1;
		System.out.println(x);
		return x;
		
	}
}
