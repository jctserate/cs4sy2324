/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5_cs4photonserate;

/**
 *
 * @author conor
 */
import java.util.ArrayList; 

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      this.earnings = 0;
      this.itemList = new ArrayList<Item>();
      storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      if (index >= 0 && index < this.itemList.size()) {
          this.earnings += this.itemList.get(index).getCost();
          System.out.printf("%s was sold in %s for %.2f.\n", this.itemList.get(index).getName(), this.name,this.itemList.get(index).getCost());
      } else {
          System.out.printf("There are only %d items in the store.\n", itemList.size());
      }    
  }
  public void sellItem(String name){
      boolean isFound = false;
      
      for (int i = 0; i < this.itemList.size(); i++) {
          if (this.itemList.get(i).getName().equals(name)) {
              this.earnings += this.itemList.get(i).getCost();
              System.out.printf("%s was sold in %s for %.2f.\n", name, this.name, this.itemList.get(i).getCost());
              isFound = true;
          } 
      }
      if (!isFound) {
          System.out.printf("%s does not sell %s.\n", this.getName(),name);
      }
      
  }
  public void sellItem(Item i){
        if (this.itemList.contains(i)) {
            this.earnings += i.getCost();
            System.out.printf("%s was sold in %s for %.2f.\n", i.getName(), this.name, i.getCost());
        } else {
            System.out.printf("%s does not sell %s.\n", this.getName(), i.getName());
        }
  }
  public void addItem(Item i){
      this.itemList.add(i);
  }
  public void filterType(String type){
      System.out.print("Filter by type: ");
      for (int i = 0; i < this.itemList.size(); i++) {
          if (this.itemList.get(i).getType().equals(type)) {
              System.out.print(this.itemList.get(i).getName() + ' ');
          }
      }
      System.out.println("");
  }
  public void filterCheap(double maxCost){
      System.out.printf("Filter by max cost (%.2f): ", maxCost);
      for (int i = 0; i < this.itemList.size(); i++) {
          if (this.itemList.get(i).getCost() <= maxCost) {
              System.out.print(this.itemList.get(i).getName() + ' ');
          }
      }
      System.out.println("");
  }
  public void filterExpensive(double minCost){
      System.out.printf("Filter by min cost (%.2f): ", minCost);
      for (int i = 0; i < this.itemList.size(); i++) {
          if (this.itemList.get(i).getCost() >= minCost) {
              System.out.print(this.itemList.get(i).getName() + ' ');
          }
      }
      System.out.println("");
  }
  public static void printStats(){
      for (int i = 0; i < storeList.size(); i++) {
          System.out.printf("%s: %.2f\n", storeList.get(i).getName(), storeList.get(i).getEarnings());
      }
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
