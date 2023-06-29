import java.io.Serializable;

public abstract class Person implements InGameInterface, Serializable {

    protected float hp; // Здоровье
    protected float curHp; // Здоровье сейчас
    protected String name;

    protected int[] damage; //Урон
    protected int attack; //Сила удара
    protected int def;




    public Person(float hp, String name, int[] damage,int attack,int def) {
        this.hp = this.curHp=hp;
        this.name = name;
        this.damage = damage;
        this.attack = attack;
        this.def = def;
      }
    @Override
    public void step(){
        System.out.println("Шаг вперёд!");
    }
    @Override
    public String getInfo(){
        return getClass().getName()+" "+name;
    }


}