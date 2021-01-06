package lesson11;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    @Override
    public String getNameOfArtist() {
        return "Basta";
    }

    @Override
    public int getAgeOfArtist() {
        return 30;
    }

    @Override
    public String getSong() {
        return "Tak plachet Vesna";
    }
}
