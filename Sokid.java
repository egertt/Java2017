public class Sokid extends LisaHind{
	double kogus;
	double hind;
	public Sokid(double kogus, double hind, double lisamaks){
		super(lisamaks);
		this.kogus=kogus;
		this.hind=hind;
	}
	public double omaHind(){
		return kogus*hind;
	}
	
}
