import java.util.HashSet;
import java.util.Iterator;

public class Client {

	private String nume;
	private String adresa;
	HashSet<ContBancar> conturi = new HashSet<ContBancar>();

	public Client(String nume, String adresa, HashSet<ContBancar> conturi) {
		this.nume = nume;
		this.adresa = adresa;
		this.conturi = conturi;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public void AfisareConturi() {
		
		Iterator<ContBancar> it = conturi.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
	}

	public void addCont(ContBancar cont) {
		
		if(!conturi.contains(cont))
			conturi.add(cont);
	}

	@Override
	public String toString() {
		
		String client = "Client [nume=" + nume + ", adresa=" + adresa  + "]";
		
		Iterator<ContBancar> it = conturi.iterator();
		
		while(it.hasNext()) {
			
			client = client + "/n" + it.next().getSumaTotala();
		}
		
		return client;
		
	}
	
	
}
