package pokemon;
import attacks.PhysicalMove.AerialAce;
import ru.ifmo.se.pokemon.*;


public class Slaking extends Vigoroth{
    public Slaking(String name, int level){
        super(name,level);
        super.setStats(150,160,100,95,65,100);
        super.setType(Type.NORMAL);
        super.addMove(new AerialAce());
    }
}
