package lesson10;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

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
