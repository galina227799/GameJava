package units;

import units.Person;

import java.util.ArrayList;

public abstract class Shooter extends Person {

    protected int kolStrel;

    public Shooter(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT, int kolStrel, int initiative) {
        super(hp, name, damage, attack, def, x, y, nT, initiative);
        this.kolStrel = kolStrel;
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {
        if (this.curHp == 0) return;
        if (this.kolStrel == 0) return;

        int k = super.findNearest(teamProtivnic);
        teamProtivnic.get(k).curHp-= (this.damage[1]+this.damage[0])/2;


        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getClass().equals("Farmer")) return;

        }
        this.kolStrel -= 1;
    }
}
