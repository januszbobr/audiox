package pl.bo.player;

import pl.bo.Audiobook;

/**
 * Created by bogdan on 30.05.2017.
 */
public interface Player extends Volumeter {

    void play(Audiobook a);

}
