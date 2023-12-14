package attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove {
    public DragonRage(){super(Type.DRAGON,0,100);}
    @Override
    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }


    @Override
    protected String describe(){return "Использует DRAGON RAGE and deals 40 damage";}


}
