package lesson10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //сделаем так чтоб спринг искал бины реализующие интерфейс Music

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;


    //Автоматичесски будет внедрено 2 зависимости в наш MusicPlayer
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public String playMusik() {
        return  " Playing: " + rapMusic.getSong();
    }

    //IoC
    //В конструктор MusicPlayer принимается объект реализующий интерфейс Music
}
