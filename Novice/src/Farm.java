import java.util.*;
import java.util.Scanner;
public  class Farm {

	public  void Fight () {
		
		 
			Scanner scanner = new Scanner(System.in);
			int choice1 = 0;
       System.out.println("1. Hippocampus(Level 45) ");
       System.out.println("2. Golem (Level 23)");
       System.out.println("3. Kong (Level 6)");
       System.out.print("Choice:");
       choice1  = scanner.nextInt();
       if(choice1 == 1) {
       	Novice.level = Novice.level + 8;
       	Novice.HP = Novice.HP -35 ;
           System.out.println("Level UP !! + 8 ");
           System.out.println("Level =  "+ Novice.level);
           System.out.println("HP = "+ Novice.HP);

       }
       else if (choice1 == 2) {
       	Novice.level = Novice.level + 5;
       	Novice.HP = Novice.HP -20 ;
           System.out.println("Level UP !! + 5 ");
           System.out.println("Level =  "+ Novice.level);
           System.out.println("HP = "+ Novice.HP);

       }
       else if (choice1 == 3) {
       	Novice.level = Novice.level + 2;
        Novice.HP = Novice.HP -13 ;
           System.out.println("Level UP !! + 2");
           System.out.println("Level =  "+ Novice.level);
           System.out.println("HP = "+ Novice.HP);

       }

   }
	 
}
