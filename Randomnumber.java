import java.util.Random;
import java.util.*;

public class Randomnumber {
	public static void main(String[] args) {
		Random random=new Random();
		HashSet<Number> hs=new LinkedHashSet<Number>();
		for(int i=0;i<10;i++) {
			int keys=random.nextInt(100);
			double values=random.nextDouble();
			hs.add(keys);
			hs.add(values);
		}
		List<Number> list=new ArrayList<Number>(hs);
		for(int j=0;j<list.size();j+=2) {
			System.out.println("key : "+list.get(j)+" value : "+list.get(j+1));
		}
	}

}
