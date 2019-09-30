
public class Pracownik {
	public Klient k;
	public String stanowisko;
	public int pensja;
	public Pracownik(String stanowisko, int pensja) {
		this.stanowisko = stanowisko;
		this.pensja = pensja;
	}
	public void ZwiekszPensje(int amount) {
		pensja += amount;
	}
	public void SetKlient(Klient k) {
		this.k = k;
	}
}
