
public class funkcjaLiniowa {
	private int a, b;
	
	public funkcjaLiniowa(int a, int b) {
		this.a=a;
		this.b=b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	void wypisz() {
		System.out.println("Wzor funkcji liniowej to f(x)= "+a+"x + "+b);
	}
	
	int ileMiejscZerowych() {
		int x;
		if(a==0 && b!=0) x=0;
		if(a==0 && b==0) x=Integer.MAX_VALUE;
		else x= 1;
		System.out.println(x);
		return x;
		
		
		
	}
}


