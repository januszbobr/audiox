package pl.bo;

import pl.bo.player.Diskman;
import pl.bo.player.Player;

/**
 * Created by bogdan on 30.05.2017.
 */
public class Start {


    public static void main(String[] args) {
        Player p = new Diskman();
        p.volume(2);
        p.play(createAlicja());
        System.out.println("Start started from b1");
    }

    private static Audiobook createAlicja() {
        Audiobook a = new Audiobook();
        a.setTytul("Alicja w krainie czarow");
        return a;
    }
}
