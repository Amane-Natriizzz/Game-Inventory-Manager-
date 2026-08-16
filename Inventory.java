package com.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.InputMismatchException;
public class Inventory {
   
  
 
  
   public static void Interface(Scanner src) {
  
     var items = new ArrayList<String>();
     var itemsQ = new HashMap<String,Integer>();
     Queue<String> queue = new LinkedList<>(items);
     
     menuLoop:
      while (true) {
        try {
 System.out.println("""
      
     ======= INVENTORY SYSTEM =======
          1. ADD ITEMS
          2. ADD ITEMS W/ QUANTITY
          3. ADD ITEMS IN THE BACK 
          4. SHOW ALL ITEMS
          5. SHOW ITEMS NAME W/OUT DUPLICATE
          6. SHOW ITEMS BY TIME YOU ADDED
          7. SORT ITEMS W/ QUANTITY ALPHABETICALLY
          8. SHOW ITEMS ALPHABETICALLY
          9. SEARCH ITEM BY NAME
         10. SEARCH ITEM BY QUANTITY
         11. DISPLAY ITEMS SIMULTENOUSLY
         12. EXIT
        
     IMPORTANT NOTICE: NO.3 CHOICE DOESN'T WORK.IT IS NOW  IN MAINTENANCE THANK YOU FOR UNDERSTANDING.
        
                    """);
    System.out.print("Enter Choice  :");
      int choice = src.nextInt();
     src.nextLine();
        
      switch (choice) {
        case 1 -> addItem(items,src);
        case 2 -> addItemQ(itemsQ,src);
        
        case 4 -> showAllItems(items);
        case 5 -> showItemsNotDuplicate(items);
        
        case 7 -> sortQAZ(itemsQ);
        case 8 -> sortAZ(items);
        case 9 -> searchItemName(itemsQ, src);
        case 10 -> searchItemQuan(itemsQ, src);
        case 11 -> displayItems(items);
        case 12 -> { Exit();
                    break menuLoop;
                      }
        default -> System.out.println("Invalid Choice");
      }
        } catch (InputMismatchException e) {
     System.out.println("INVALID INPUT MUST CONTAIN NUMBER ONLY");
     src.nextLine();
   } 
     
   }    
   }
     
   
   
   public static void addItem(ArrayList <String> items, Scanner src) {
     System.out.print("Add Item  :");
     String item = src.nextLine();
     
     items.add(item);
     System.out.println("ITEM ADDED! SUCESSFULLY TO INVENTORY");
     System.out.println();
   }
   
   
   public static void addItemQ(HashMap<String,Integer> itemsQ, Scanner src) {
     System.out.println();
     System.out.print("Add item  :");
     String itemsq = src.nextLine();
     System.out.print("Quantity  :");
     int quan = src.nextInt();
     
     itemsQ.put(itemsq, quan);
     System.out.println("ITEMS & QUANTITY ADDED TO INVENTORY");
   }
   
   
   
   public static void showAllItems(ArrayList<String> items) {
     if(items.isEmpty()) {
       System.out.println("EMPTY INVENTORY");
       return;
     } else {
     for (String item : items) {
       System.out.println(item);
     }
     }
   }
   
   
   public static void showItemsNotDuplicate(ArrayList<String> items) { var itemsD = new HashSet<> (items);
     if (items.isEmpty()) {
       System.out.println("EMPTY INVENTORY");
       return;
     } else {
     for (String itemD: itemsD) {
       System.out.println(itemD);
     }
     }
   }
  
  
  public static void sortQAZ(HashMap<String, Integer> itemsQ) {
   var sorter = new TreeMap<String, Integer>();
 
    for (String item : itemsQ.keySet()) {
      sorter.put(item, itemsQ.get(item));
    }
    for (String key : sorter.keySet()) {
      int value = sorter.get(key); 
     System.out.println(key +"-"+ value);
    }
  }
  
  
  
  public static void sortAZ(ArrayList <String> items) {
   items.sort(null);
    for (String item : items) {
      System.out.println(item);
    }
  }
  
  
  public static void searchItemName(HashMap<String, Integer> itemsQ, Scanner src) { 
    System.out.print("Search Item Name  :");
    String search = src.nextLine();
    for (String key : itemsQ.keySet()) {
    if(key.equalsIgnoreCase(search)) {
   System.out.println(key +" - " +       itemsQ.get(key));
   return;  
    } 
    }
    System.out.println("ITEM NOT IN INVENTORY & KEY MUST MATCH");
    }
    
    
    
  
  public static void searchItemQuan(HashMap <String, Integer> itemsQ, Scanner src)  {
    System.out.print("Search Item Quantity  :");
    int quan = src.nextInt();
    src.nextLine();
    for (String key : itemsQ.keySet()) {
      if (itemsQ.get(key) == quan) {
     System.out.println(key + " - " + itemsQ.get(key));     
      }
    } 
  }
  
  
  
  public static void displayItems(ArrayList<String> items) {
    Queue <String> queue = new LinkedList<>(items);
  /*  for (String item : items ) {
      queue.offer(items);
    }
    */
    for (String item : queue) {
      System.out.println(item);
    }
  }
  
  
  
  
  public static void Exit() {
    System.out.println("THANKS FOR USING THE PROGRAM I HOPE YOU ENJOY IT BYE ...;-;... ");
  }
  
  
  
  
  
  
  
  
  
}