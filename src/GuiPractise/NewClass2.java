package GuiPractise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class NewClass2 {  
public static void main(String[] args) {  
   LocalDateTime t=LocalDateTime.now();
    System.out.println("Hello entrepreneur raajan its "+t); 
    DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-yyyy-MM  HH-MM-ss  ");
    String s=t.format(format);
    System.out.println("Hello entrepreneur raajan its "+s); 
    
    
      
}  
}  