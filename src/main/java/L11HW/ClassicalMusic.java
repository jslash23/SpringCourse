package L11HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

   private List<String> classicalSongs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        classicalSongs.add("Moon sonate");
        classicalSongs.add("To Elize");
        classicalSongs.add("Vivaldi");
    }

    @Override
    public List<String> getSong()  {

      return classicalSongs;
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
