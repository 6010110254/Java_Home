import java.util.*;
public class bag {
	//bag m3 = new bag();
	public static int Energy ;
	public static int Banned ;
	public static int Medkid;

	  public void inventory () {

			Scanner scanner = new Scanner(System.in);
			int choice2 = 0;
			int choice1 = 0;
			int choice3 = 0;
	        System.out.println("============Bag===============");
	        System.out.println("Enegy = "+ Energy);
	        System.out.println("Banned = "+ Banned);
	        System.out.println("Medkid = "+ Medkid);
	        System.out.println("============Bag===============");
	        System.out.println("1.Use Item ");
	        System.out.println("2.Description Item ");
	        System.out.println("3.Back ");
	        System.out.print("Choice:");
	        choice2  = scanner.nextInt();
	        if(choice2 == 1) {        	
		        System.out.println("1.Enegy = "+ Energy);
		        System.out.println("2.Banned = "+ Banned);
		        System.out.println("3.Medkid = "+ Medkid);

       System.out.print("Choice:");
       choice1  = scanner.nextInt();
       if(choice1 == 1) {
    	   if (Energy > 0) {
       	Energy = Energy - 1;
       	Novice.HP = Novice.HP + 5 ;
		 System.out.println("HP Novice : "+ Novice.HP);}
          else {
		 System.out.println("Your item has no. ");
          }

       }
       else if (choice1 == 2) {
    	   if (Banned > 0) {
       	Banned = Banned - 1;
       	Novice.HP = Novice.HP + 10 ; 
		 System.out.println("HP Novice : "+ Novice.HP);}
          else {
		 System.out.println("Your item has no. ");
          }

       }
       else if (choice1 == 3) {
    	   if (Medkid > 0) {
       	Medkid = Medkid - 1;
       	Novice.HP = Novice.HP + 35 ;
		System.out.println("HP Novice : "+ Novice.HP);
       	}
          else {
		 System.out.println("Your item has no. ");
          }

       }
	  }
	   else if (choice2 == 2){
	        System.out.println("1.Enegy ");
	        System.out.println("2.Banned ");
	        System.out.println("3.Medkid  ");
	        System.out.print("Choice:");
	        choice3  = scanner.nextInt();
	        if(choice3 == 1) {
	        	Description.Energy();
	           }
	           else if (choice3 == 2) {
	        	Description.Banned();
	           }
	           else if (choice3 == 3) {
	            Description.Medkid();

	           }
	   }
	 }	 

}
