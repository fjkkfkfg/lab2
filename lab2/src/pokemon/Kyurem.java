package pokemon;
import attacks.PhysicalMove.BrutalSwing;
import attacks.SpecialMove.HyperVoice;
import attacks.SpecialMove.DragonRage;
import attacks.StatusMove.Swagger;
import ru.ifmo.se.pokemon.*;
public class Kyurem extends Pokemon{
    public Kyurem(String name, int level){
        super(name,level);
        super.setStats(125,130,90,130,90,95);
        super.setType(Type.DRAGON,Type.ICE);
        super.setMove(new BrutalSwing(),new Swagger(),new HyperVoice(),new DragonRage());

    }
}
