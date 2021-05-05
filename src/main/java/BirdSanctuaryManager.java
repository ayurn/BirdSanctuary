import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {

    //List<Bird> birdList = new ArrayList<Bird>();
    Set<Bird> birdList = new HashSet<Bird>();

    public void add(Bird bird) {
        if (birdList.add(bird)) {
        bird.incrementCount();
        }
    }

    public void remove(Bird bird) {
        birdList.remove(bird);
        bird.decrementCount();
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void print() {
        for (Bird bird : birdList) {
            bird.eat();
            if(bird instanceof Flyable) {
                ((Flyable)bird).fly();
            }
            if(bird instanceof Swimmable) {
                ((Swimmable)bird).swim();
            }

        }
    }
}
