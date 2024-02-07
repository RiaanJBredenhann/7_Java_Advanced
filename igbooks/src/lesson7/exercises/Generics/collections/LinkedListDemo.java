

package lesson7.exercises.Generics.collections;


import java.util.LinkedList;
import java.util.List;



public class LinkedListDemo {
    
    public static void main(String args[])
    {
        
    List <String> partList=new LinkedList<>();

   
    partList.add("bolt");
    partList.add("nut");
    partList.add("nail");
    

    for (String partObj:partList){
      String partName = partObj; // Demonstrates autoboxing.
      System.out.println("Part name: " + partName);  
    } 
    
    partList.add(1,"hammer");
    
    
    
      for (String partObj:partList){
      String partName = partObj; // Demonstrates autoboxing.
      System.out.println("Part name: " + partName);  
    } 
      
      partList.remove(2);
  }


    
}
