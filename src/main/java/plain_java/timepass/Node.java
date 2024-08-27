package timepass;

public class Node
{
    String name;
    Table table;
    

    Node()
    {
        table = new Table(0, name);
    }
}

class Table
{
    Object data[][] = new Object[5][];
    
    Table(int index,String name)
    {
        data[index][0] = name;
        data[index][1] = 0;
        data[index][2] = name;
    }
}
