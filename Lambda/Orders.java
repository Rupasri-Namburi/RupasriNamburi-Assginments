import java.util.*;

public class Orders {

	public static void main(String[] args)
	{
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		
		orderList.add(new Order("Raja", 3000,"Accepted"));
		orderList.add(new Order("Adithya", 250,"Accepted"));
		orderList.add(new Order("Jai", 900,"Completed"));
		orderList.add(new Order("Raj", 800,"Denied"));
		orderList.add(new Order("surya", 5500,"Accepted"));
		orderList.add(new Order("Rani", 2000,"Completed"));
		
		orderList.removeIf(order -> (order.price <= 1000)); 

		//orderList.removeIf(order -> (order.status <= "Completed"));
		//filter(orderList, (status)->status.startsWith("C"));

		/*Collections.sort(orderList, (order, order1) -> {
			return order.price.compareTo (1000); 
		 });*/  


		
		
		System.out.println("The final list is: ");
		for(Order order : orderList)
		{
			System.out.println(order.name+" : "+order.price+" "+order.status);
		}
	}
}