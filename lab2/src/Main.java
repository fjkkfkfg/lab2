import pokemon.*;
import ru.ifmo.se.pokemon.Battle;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Eevee eevee = new Eevee("eevee", 1);
        Eevee jolteon = new Jolteon("jolteon", 1);
        Kyurem kyurem = new Kyurem("kyurem", 1);
        Slaking slaking = new Slaking("slaking", 1);
        Slakoth slakoth = new Slakoth("slakoth", 1);
        Vigoroth vigoroth = new Vigoroth("vigoroth", 1);

        b.addAlly(eevee);
        b.addAlly(slaking);
        b.addAlly(vigoroth);

        b.addFoe(jolteon);
        b.addFoe(kyurem);
        b.addFoe(slakoth);

        b.go();
    }
}