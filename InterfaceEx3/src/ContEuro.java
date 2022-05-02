
public class ContEuro extends ContBancar {

	public ContEuro(String numarCont, double suma) {
		super(numarCont, suma);
	}

	@Override
	public double getSumaTotala() {
		
		return this.getSuma() * 36000;
	}

	public double getDobanda() {
		
		double d = 3/10;
		
		if(this.getSuma() > 500)
			return d;
		else
			return 0;
	}
}
