import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> team1 = newTeam();
        ArrayList<Person> team2 = newTeam();

        printInfo(team1);
        printInfo(team2);

    }
    private static String getName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    private static ArrayList<Person> newTeam() {

        ArrayList<Person> team = new ArrayList<Person>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {

            int var = rand.nextInt(0, 7);
            switch (var) {
                case 1:
                    team.add(new Farmer(getName()));
                    break;
                case 2:
                    team.add(new Monk(getName()));
                    break;
                case 3:
                    team.add(new Sniper(getName()));
                    break;
                default:
                    team.add(new Archer(getName()));
                    break;
            }
        }
        return team;
    }

    private static void printInfo(ArrayList<Person> team){
        for (int i = 0; i < team.size(); i++) {
//            System.out.println(team.get(i).myNameIs());
            System.out.println(team.get(i).getInfo());
        }
        System.out.println("=============================================");
    }

}