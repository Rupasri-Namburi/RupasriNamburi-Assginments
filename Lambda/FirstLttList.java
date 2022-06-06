import java.util.Arrays; 
import java.util.Objects; 
import java.util.stream.Collectors; 
 
public class FirstLttList{

   private static StringBuilder charBuffer = new StringBuilder();
     
   public static String processWords(String input)
   {
      
        String s[] = input.split("(\\s)+");
         
        for(String values : s)
        {
           
           charBuffer.append(values.charAt(0));
            System.out.println(Arrays.stream(s) 
                    .filter(Objects::nonNull) 
                    .map(si->si.charAt(0)) 
                    .collect(Collectors.toList())); 
        	
        }
         
      return charBuffer.toString();
   }
    
  
   public static void main (String[] args)
   {
      String input = "First letter of each word";
      System.out.println(processWords(input));
   }
}