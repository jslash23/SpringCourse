package L12;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit(){
        System.out.println("Doing my init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing destroy");
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
