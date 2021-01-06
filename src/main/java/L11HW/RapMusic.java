package L11HW;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RapMusic implements Music {
    List<String> rapSongs;

    @Override
    public String getNameOfArtist() {
        return "Basta";
    }

    @Override
    public int getAgeOfArtist() {
        return 30;
    }

    @Override
    public List<String> getSong()
    {
        String song1 = "TuPak";
        String song2 = "Basta";
        String song3 = "Eminem";
        rapSongs.add(song1);
        rapSongs.add(song2);
        rapSongs.add(song3);
        return rapSongs;
    }
}
