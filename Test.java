import java.util.*;
public class Test{
	public static void main(String[] arg){
		Kindad k1=new Kindad(2, 3, 1.5);
		List<LisaHind> kasitoo=new ArrayList<LisaHind>();
		kasitoo.add(k1);
		kasitoo.add(new LapiTekk(3, 4, 5, 1.13, 1.5));
		for(LisaHind l: kasitoo){
			System.out.println(l.MyygiHind());
		}
	}
}


/*9.0
29.28*/
