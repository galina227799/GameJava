import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> team1 = newTeam(1,1);
        ArrayList<Person> team2 = newTeam(10,2);
        ArrayList<Person> teamAll = new ArrayList<>();
        teamAll.addAll(team1);
        teamAll.addAll(team2);
        teamAll.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.initiative- o2.initiative;
            }
        });

        printInfo(team1);
        printInfo(team2);
        System.out.println("_".repeat(20));


        for (Person p:teamAll) {

            if(team1.contains(p)) {
                p.step(team2,team1);
            }
            else {
                p.step(team1,team2);
            }

        }

        printInfo(team1);
        printInfo(team2);

    }
    private static String getName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    private static ArrayList<Person> newTeam(int k, int nT) {

        ArrayList<Person> team = new ArrayList<Person>(10);
        Random rand = new Random();
        for (int i = 1; i < 11; i++) {

            int var = rand.nextInt(0, 7);
            switch (var) {
                case 1:
                    team.add(new Farmer(getName(),k,i,nT));
                    break;
                case 2:
                    team.add(new Monk(getName(),k,i,nT));
                    break;
                case 3:
                    team.add(new Sniper(getName(),k,i,nT));
                    break;
                default:
                    team.add(new Archer(getName(),k,i,nT));
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