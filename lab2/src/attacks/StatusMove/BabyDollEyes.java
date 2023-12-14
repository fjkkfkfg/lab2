package attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class BabyDollEyes extends StatusMove{
    public BabyDollEyes(){super(Type.FAIRY,0,100);}


    public void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    public void applyOppEffects(Pokemon p){
        Effect e = new Effect();
        p.addEffect(e);
    }
    @Override
    protected String describe(){return "Uses BabyDollEyes and lowers the enemy`s attack ";}
}
