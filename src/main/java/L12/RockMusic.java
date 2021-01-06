package L12;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Corn";
    }

    @Override
    public String getNameOfArtist() {
        return "Jack";
    }

    @Override
    public int getAgeOfArtist() {
        return 41;
    }
}
