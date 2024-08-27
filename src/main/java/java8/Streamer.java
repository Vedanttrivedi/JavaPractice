package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamer
{
    public static void main(String[] args)
    {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Abcd",222));
        players.add(new Player("XYZW",100));
        players.add(new Player("PQrs",400));


        //Fetch all the players whose score is more than 150
        List<Player> vplayers = players.stream().filter(player -> player.score > 150)
                .toList();
        System.out.println(vplayers);


        //List players names only whose score is less than 150
        List<String> names = players.stream().filter(player -> player.score < 150).map(player -> player.name).toList();
        System.out.println(names);

        //Sort the list in reverse order using comparator
        List<Player> nplayers = vplayers.stream().sorted((p1,p2) -> p2.score - p1.score).toList();
        System.out.println(nplayers);

        //Create a list from array
        String[] data = {"NYC","NXT","DXC"};
        Stream<String> ds = Arrays.stream(data);
    }
    private  static  String printObj(Player p)
    {
        return "Player ("+p.name+")"+" Score : "+p.score+")";
    }
}

class Player
{
    String name;
    int score;

    public Player(String name,int score)
    {
        this.name = name;
        this.score = score;
    }
    public String toString()
    {
        return "Player ("+name+")"+" Score : "+score+")";

    }
}
