package pl.bo;

/**
 * Created by bogdan on 30.05.2017.
 */
public class Start {


    public static void main(String[] args) {
        Audiobook a = createAudiobookAlicja();
        System.out.println("słuchamy: " + a);
    }

    private static Audiobook createAudiobookAlicja() {
        Audiobook a = new Audiobook();
        a.setTytul("Alicja w krainie czarów");
        return a;
    }
}
