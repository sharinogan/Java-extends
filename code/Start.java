import java.util.Arrays;
import java.util.Comparator;

class Start {

    public static void main(String[] data) {        
        Player[] all = {
            new Player("David", 7, 45000.0),
            new Player("Michael", 5, 40000.0),
            new Player("Messi", 10, 43000.0),
            new Player("Peter", 1, 42000.0)
        };
        Arrays.sort(all, (p, q) -> p.number - q.number);
        for (Player player : all) {
            System.out.println(player.name);
        }
    }
}

class PlayerCompare implements Comparator {
    public int compare(Object x, Object y) {
        Player a = (Player)x;
        Player b = (Player)y;
        return a.number - b.number;
    }
}

class Player {
    String name;
    int number;
    double salary;
    
    Player (String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }
}
