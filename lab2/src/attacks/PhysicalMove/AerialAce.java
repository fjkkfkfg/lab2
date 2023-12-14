package attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(){super(Type.FLYING,60,99999999);}

    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }


    @Override
    protected String describe(){return "AerialAce deals 60 damage";}
}
