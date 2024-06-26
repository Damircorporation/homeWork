package family_TREE.model.human;

import family_TREE.model.human.Human;
import java.util.Comparator;

public class HumanComparatorByBirthDate implements Comparator<Human> {

    public int compare(Human o1, Human o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
