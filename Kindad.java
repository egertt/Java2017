public class Kindad extends LisaHind{
	double kogus;
	double hind;
	public Kindad(double kogus, double hind, double lisamaks){
		super(lisamaks);
		this.kogus=kogus;
		this.hind=hind;
	}
	public double omaHind(){
		return kogus*hind;
	}
	
}
