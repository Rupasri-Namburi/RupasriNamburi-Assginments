import java.util.HashSet;
public class Hashset {
   public static void main(String args[]) {
      
      HashSet<String> hashset = 
               new HashSet<String>();

      hashset.add("watermelon");
      hashset.add("Apple");
      hashset.add("Mango");
      hashset.add("Grapes");
      hashset.add("Orange");
      hashset.add("Muskmelon");
      hashset.add("Custard Apple");
      hashset.add("Coconut");
      hashset.add("Strawberry");
      hashset.add("Blackberry");
      hashset.add("Kiwi");
      hashset.add("Roseberry");
      hashset.add("Apple");
      hashset.add("Mango");
      hashset.add(null);
      hashset.add(null);

      System.out.println(hashset);
    }
}