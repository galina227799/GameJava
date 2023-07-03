package units;

import java.util.ArrayList;

public abstract class Warrior extends Person{

    public Warrior(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT) {

        super(hp, name, damage, attack, def, x, y, nT);
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic) {
        int k = findNearest(teamProtivnic);
    }
}
