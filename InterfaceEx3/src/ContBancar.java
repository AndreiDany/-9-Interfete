
public abstract class ContBancar implements SumaTotala {

	private String numarCont;
	private double suma;
	
	public ContBancar(String numarCont,  double suma)
	{
		this.numarCont = numarCont;
		this.suma = suma;
	}
	
	
	
	public String getNumarCont() {
		return numarCont;
	}



	public void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}



	public double getSuma() {
		return suma;
	}



	public void setSuma(double suma) {
		this.suma = suma;
	}



	public boolean equals(ContBancar cont)
	{
		if(cont.numarCont == this.numarCont)
			return true;
		return false;
	}



	@Override
	public String toString() {
		return "ContBancar [numarCont=" + numarCont + ", suma=" + suma + "]";
	}

}
