import java.util.HashMap;
import java.util.Map;


public class ZabawaKolekcjami {
	private HashMap<Pracownik,Float> collection = new HashMap<Pracownik,Float>();
	private HashMap<Klient,Pracownik> collection1 = new HashMap<Klient,Pracownik>();
	
	public static void main(String[] args) {
		ZabawaKolekcjami test = new ZabawaKolekcjami();
		Pracownik Pa = new Pracownik("manager", 1000);
		Pracownik Pb = new Pracownik("employee", 500);
		
		Klient kA = new Klient("Przemyslaw");
		Klient kB = new Klient("Mariusz");
	
		
	}
	public int moreMoney(HashMap<Klient,Pracownik> collection1) {
		int wynik = 0;
		for(Map.Entry<Klient,Pracownik> entry : collection1.entrySet()) {
			Pracownik employeeEdit = entry.getValue();
			employeeEdit.k = entry.getKey();
			
			if (employeeEdit.pensja < 1000)
				wynik++;
		}
		
		return wynik;
	}

	public HashMap dajPodwyzke(HashMap<Pracownik,Float> collection) {
		
		for(Map.Entry<Pracownik, Float> entry : collection.entrySet()) {
			Pracownik employeeEdit = entry.getKey();
			if (employeeEdit.stanowisko == "manager") {				
				employeeEdit.ZwiekszPensje(1000);
			}
		}
		
		return collection;
	}
}