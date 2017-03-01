public abstract class LisaHind{
	double lisamaks;
	public LisaHind(double uusHind){
		lisamaks=uusHind;
	}
	public abstract double omaHind();
	public double MyygiHind(){
		return omaHind()*lisamaks;
	}
}