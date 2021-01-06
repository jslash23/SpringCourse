package lesson11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //сделаем так чтоб спринг искал бины реализующие интерфейс Music

    private Music music1;
    private  Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusik() {
        return " Playing: " + music1.getSong() + " " + music2.getSong();
    }

    //IoC
    //В конструктор MusicPlayer принимается объект реализующий интерфейс Music
}
