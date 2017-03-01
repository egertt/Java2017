import java.util.*;
public class Test{
	public static void main(String[] arg){
		Sokid s1=new Sokid(12, 3, 1.5);
		
		List<LisaHind> kasitoo=new ArrayList<LisaHind>();
		kasitoo.add(s1);
		
		kasitoo.add(new VatiTekk(13, 4, 5, 1.13, 1.5));
		
		for(LisaHind l: kasitoo){
			System.out.println("Müügihind on=" + l.MyygiHind());

		}
	}
}


/*9.0
29.28*/
