import java.util.HashMap;
import java.util.Date;

public class Property {
	public static void main(String args[]) {
		Pair<String,String> p=new Pair <String,String>("1","Hello");
		HashMap<String,String>
		h= new HashMap<String,String>();
		Pair<String,Date>
		p1=new Pair<String,Date>("Today is ", new Date());
		h.put(p.getkey(),p.getValue());
		System.out.println(h);
		HashMap<String,String>
		h1 = new HashMap<String,String>();
		h1.put(p1.getkey(),p1.getValue());
		System.out.println(h1);
	}

}

