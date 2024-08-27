package java8;
//Record class is used when we just want a class to represent structure
//Some classes haave service methods or utility methods which do some computation
//But when we want class to only have some structure we use record

import java.util.Objects;

class GoodPlayer
{
    String name;
    int id;
    public GoodPlayer(String name,int id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodPlayer that = (GoodPlayer) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "GoodPlayer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
//As we can see just to represent
public class RecordClass
{
    public static void main(String[] args)
    {
        GoodPlayer gp1 = new GoodPlayer("XyZ",1);
        GoodPlayer gp2 = new GoodPlayer("Abc",2);

    }
}
