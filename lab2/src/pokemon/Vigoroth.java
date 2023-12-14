package pokemon;
import attacks.PhysicalMove.Slash;
import ru.ifmo.se.pokemon.*;


public class Vigoroth extends Slakoth {
    public Vigoroth(String name, int level){
        super(name,level);
        super.setStats(80,80,80,55,55,90);
        super.setType(Type.NORMAL);
        super.addMove(new Slash());
    }

}
