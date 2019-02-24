
import java.util.Scanner;
public class Career extends Novice {
	Scanner scanner = new Scanner(System.in);
public void career (){
	int choice ;
    System.out.println("1. Swordsman");
    System.out.println("2. Archer");
    System.out.print("Choice:");
    choice  = scanner.nextInt();
    if (choice == 1 ) {
    	career = "Swordsman";
    }
    else if (choice == 2) {
    	career = "Archer";
    }
}
}
