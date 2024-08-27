package sports;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
class Sampler{
    public static void main(String[] args){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.toLocalDate());        
        Player p1 = new Player("Vedant");
        System.out.println(p1.name());
    }
}


record Player(String name){}