package units;

import java.sql.Array;
import java.util.List;

public  class Coordinats {
    int x;
    int y;

    public Coordinats(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: "+x+" y: "+y;
    }

    public static double Rastoynie(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

    }
}