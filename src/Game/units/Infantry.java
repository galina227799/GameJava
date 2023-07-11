package Game.units;

import java.util.ArrayList;

public abstract class Infantry extends Person {
    public Infantry(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT, int initiative) {
        super(hp, name, damage, attack, def, x, y, nT, initiative);
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
