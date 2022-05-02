import java.util.HashSet;
import java.util.Iterator;

public class Banca {

	private String codBancar;
	private HashSet<Client> clienti = new HashSet<Client>();
	
	public Banca(String codBancar) {
		this.codBancar = codBancar;
	}

	public String getCodBancar() {
		return codBancar;
	}

	public void setCodBancar(String codBancar) {
		this.codBancar = codBancar;
	}

	public void afisareClient(String nume)
	{
		Iterator<Client> it = clienti.iterator();
		
		while(it.hasNext()) {
			{
				Client client = it.next();
				if(client.getNume() == nume)
				{
					client.toString();
				}
			}
				
		}
	}

	public void addClient(Client client) {

		if(!clienti.contains(client))
			clienti.add(client);
	}
	
	
}
