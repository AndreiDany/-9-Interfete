import java.util.HashSet;

public class ClientBanca {

	public static void main(String[] args) {
		
	ContBancar cont1 = new ContLEI("1234", 100);
	ContBancar cont2 = new ContLEI("2468", 100);
	ContBancar cont3 = new ContEuro("2345", 200);
	
	HashSet<ContBancar> conturi = new HashSet<ContBancar>();
	conturi.add(cont1);
	conturi.add(cont2);
	
	Client client = new Client("Andrei", "0000",  conturi);
	
	System.out.println(cont1.toString());
	System.out.println(cont2.toString());
	
	((ContLEI)cont1).transfer(cont2, 50);
	
	System.out.println(cont1.toString());
	System.out.println(cont2.toString());
	
	client.AfisareConturi();
	
	client.addCont(cont3);
	
	client.AfisareConturi();

	}

}
