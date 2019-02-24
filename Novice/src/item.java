import java.util.Scanner;
import java.util.*;
public class item extends bag{

	 public  void item () {
			Scanner scanner = new Scanner(System.in);
		int choice2 =0;
        System.out.println("1. Energy Drink ");
        System.out.println("2. Banned");
        System.out.println("3. Medkit");
        System.out.print("Choice:");
        choice2  = scanner.nextInt();
        if (choice2 == 1) {
       	Energy = Energy + 1;
       	 
        }
        else if (choice2 == 2) {
       	 Banned = Banned +1 ;
       	 
        }
        else if (choice2 == 3) {
       	 Medkid = Medkid +1 ;
       	
        }
  

	 }
}
