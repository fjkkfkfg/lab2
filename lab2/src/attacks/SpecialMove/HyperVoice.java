package attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class HyperVoice extends SpecialMove {
    public HyperVoice(){super(Type.NORMAL,90,100);}

    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }

    @Override
    protected String describe(){return "Использует HyperVOICE!!!! НАНОСИТ УРОН 90";}

}
