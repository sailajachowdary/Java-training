package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // Create an instance of Veena and call play() method
        Veena veena = new Veena();
        veena.play();

        // Create an instance of Saxophone and call play() method
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Place the above instances in a variable of type Playable and then call play()
        Playable playableVeena = veena;
        playableVeena.play();

        Playable playableSaxophone = saxophone;
        playableSaxophone.play();
    }
}