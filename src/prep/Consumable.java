package prep;

import java.util.ArrayList;
import java.util.Collection;

public interface Consumable {

    void consume(String name);

    Collection<String> getFullDescription = new ArrayList<>();

}
