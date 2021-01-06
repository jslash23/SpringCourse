package L11HW;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockSongs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        rockSongs.add("Corn");
        rockSongs.add("ac/dc");
        rockSongs.add("Metallica");
    }

    @Override
    public List<String> getSong() {
      return rockSongs;
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
