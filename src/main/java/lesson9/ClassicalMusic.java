package lesson9;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "To Elize";
    }

    @Override
    public String getNameOfArtist() {
        return "Mozart";
    }

    @Override
    public int getAgeOfArtist() {
        return 150;
    }
}
