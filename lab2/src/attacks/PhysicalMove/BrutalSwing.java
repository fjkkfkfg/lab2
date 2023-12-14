package attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove{
    public BrutalSwing(){super(Type.DARK,60,100);}

    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }


    @Override
    protected String describe(){return "Использует BrutalSwing и наносит 60 единиц урона";}

}
