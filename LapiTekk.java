public class LapiTekk extends LisaHind{
	double riie, niit, rhind, nhind;
	public LapiTekk(double riie, double niit, double rhind, double nhind, double lisamaks){
		super(lisamaks);
		this.riie=riie;
		this.niit=niit;
		this.rhind=rhind;
		this.nhind=nhind;
	}
	public double omaHind(){
		return (riie*rhind)+(niit*nhind);
	}
}