
public class ContLEI extends ContBancar {

	public ContLEI(String numarCont, double suma) {
		super(numarCont, suma);
	}

	@Override
	public double getSumaTotala() {

		return this.getSuma();
	}

	public void transfer(ContBancar cont, double suma)
	{
		if(cont.getClass() == this.getClass()) {
			
			this.setSuma(this.getSuma() - suma);
			cont.setSuma(cont.getSuma() + suma);
			
		}
		else
			System.out.println("Atentie, acest cont nu e in lei!");
	}
}
