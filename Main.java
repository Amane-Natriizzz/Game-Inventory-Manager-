package com.example;
import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
     var src = new Scanner(System.in);
     
     
      menuloop:
      while (true) {
      System.out.println("""
      === GAME INVENTORY MANAGER ===
      """);
      
      System.out.print("""
                       1. ENTER INVENTORY 
                       2. EXIT
                      """);
      
      System.out.print("Enter Choice: ");
      int choice = src.nextInt();
      src.nextLine();
      
      switch (choice) {
      case 1 -> Inventory.Interface(src);
      case 2 -> {
        System.out.println("PROGRAM FINISHED");
       break menuloop; 
      }
      default -> System.out.println("Invalid Choice eg..1,2");    
      }
   }
   }
}