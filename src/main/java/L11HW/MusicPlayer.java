package L11HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Random randomGenerator = new Random();
    //сделаем так чтоб спринг искал бины реализующие интерфейс Music

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusik(MusicType musicType) {
        List<String> songs;
        String song;

        if (musicType.equals(MusicType.CLASSICAL)) {
            song = getRandom(music1.getSong());
            //String song = songs.
        } else {
            song = getRandom(music2.getSong());
        }

        return song;
    }

    public String getRandom(List<String> songs) {
        int index = randomGenerator.nextInt(songs.size());
        return songs.get(index);
    }
   /* public static String getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }*/


    //IoC
    //В конструктор MusicPlayer принимается объект реализующий интерфейс Music
}
