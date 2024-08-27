package sports;

public class Player {
    final private String name;
    protected Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
