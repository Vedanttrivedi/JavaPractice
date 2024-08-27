package generalProblems;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort the player based on their scores in decreasing order
//If the scores are same then sort them based on their alphabetical order

class Player
{
    String name;
    int score;
    double mainscore;
    public Player(String name,int score,double ms)
    {
        this.name = name;
        this.score = score;
        mainscore = ms;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", mainscore=" + mainscore +
                '}';
    }
}

class PlayerComparator implements Comparator<Player>
{
    @Override
    public int compare(Player p1,Player p2)
    {
        System.out.println(p1.score + "\t"+p2.score);
        Integer value = Integer.compare(p1.score,p2.score);
        if(value==0)
            return p1.name.compareTo(p2.name);
        return value;
    }
}

//class ScoreComparator implements Comparator<Student>
//{
//    @Override
//    public int compare(Student s1,Student s2)
//    {
//        int val = Double.compare(s2.getCgpa(), s1.getCgpa());
//        if(val!=0)
//            return val;
//        int compareNames = s1.getFname().compareTo(s2.getFname());
//        if(compareNames!=0)
//            return compareNames;
//
//        return Integer.compare(s1.getId(), s2.getId());
//    }
//}

public class HR_Comparator
{
    public static void main(String[] args)
    {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Vedant",222,264.0));
        players.add(new Player("Boxer",222,250));
        players.add(new Player("HugeOne",212,250));

        System.out.println(players);
    }
}
