
public class funkcjaLiniowaKwadratowaTest {

	public static void main(String[] args) {
		funkcjaLiniowa fl = new funkcjaLiniowa(-8,12);
		fl.wypisz();
		fl.ileMiejscZerowych();
		
		funkcjaKwadratowa fk = new funkcjaKwadratowa(-3, 12,11);
		fk.wypisz();
		fk.ileMiejscZerowych();
	}

}
