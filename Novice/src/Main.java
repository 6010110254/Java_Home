import java.util.Scanner;
import java.io.*;
//แยกbag item แล้ว ข้อมูล ไม่reference กัน เลยทำให้อยู่ Class เดียวกัน
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
  Novice m1 = new Novice();
  item m2 = new item();
  bag m3 = new bag();
  Farm m4 = new Farm();
  Career c = new Career();

        int choice = 0;


		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!! Hello Novice !!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!! Play Game About !!!!!!!!!!!!");
		System.out.println("!!!!!!!!! Level UP 100 You Win !!!!!!!");
		System.out.println("!!!!!!!!!  HP = 0 You Lost  !!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("-------Choose Career for Novice-------");
		c.career();
		System.out.println("========== Status Novice =============");
		System.out.print("========= Career:"+ c.career);
		System.out.println(" =========== ");
		System.out.println("        Level your is :"+ Novice.level);
		System.out.println("         HP your is :"+ Novice.HP);
		System.out.println("============== Start Game ============");
		
      while ( Novice.HP > 0 && Novice.level < 100) {
    	  System.out.println("_________________________________");
  		System.out.println("Choose What wiil you do ?");
            System.out.println("1. Farm");
            System.out.println("2. Watch bag");
            System.out.println("3. Get Item");
            System.out.print("Choice:");
        choice  = scanner.nextInt();
        
  
        
		 if(choice == 1){

				m4.Fight();
	            } 
	     else if (choice == 2){

				m3.inventory();
	     } 	   
	     else if (choice == 3){
	    	m2.item();
	 		
	     } 
   	  System.out.println("_________________________________");
        }
       if (Novice.level > 100 ) {
        System.out.println("=======================");
        System.out.println("You Win !! :) ");
 		System.out.println("HP = " + Novice.HP);
 		System.out.println("Level  = 100 ");
 		System.out.println("Thank you For playing");
        System.out.println("=======================");
       }
       else if (Novice.HP < 0) {
           System.out.println("=======================");
           System.out.println("You lost !! :( ");
    		System.out.println("HP = 0 ");
    		System.out.println("Thank you For playing");

           System.out.println("=======================");
    	   
       }
	}
}