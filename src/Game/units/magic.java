package Game.units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class magic extends Person {

    int mana;
    public magic(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT, int mana, int initiative) {
        super(hp, name, damage, attack, def, x, y, nT, initiative);
        this.mana = mana;
    }



    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {
        if (mana <= 0) return;
        Person igrok = team.get(findNearest(team));
        if (igrok.hp == igrok.curHp) return;

        else {
            igrok.getDamage(damage[0]);
            mana += damage[0];
            if (igrok.curHp > igrok.curHp)
                igrok.curHp = igrok.hp;
        }
    }
    @Override
    public String getInfo() {
        return String.format("%s \u2747: %s",super.getInfo(),this.mana);

    }
//    public Person findeDamagePerson(ArrayList<Person> team) {
//        ArrayList<Person> damageSort = new ArrayList<Person>(10);
//        damageSort = team;
//        damageSort.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return (int) ((o1.hp - o1.curHp) - (o2.hp - o2.curHp));
//            }
//        });
//        return damageSort.get(0);
//    }
}
