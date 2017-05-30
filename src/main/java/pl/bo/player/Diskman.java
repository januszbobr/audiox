package pl.bo.player;

import pl.bo.Audiobook;

/**
 * Created by bogdan on 30.05.2017.
 */
public class Diskman implements Player {

    @Override
    public void volume(Integer size) {
        System.out.println("ustawiam glośność na " + size);
    }

    @Override
    public void play(Audiobook a) {
        System.out.println("playing: "+a);
    }
}
