package family_tree.family_tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public interface TreeNode <T> extends Serializable {
    void setId(long id);
    long getId();
    T getFather();
    T getMother();
    boolean addChild(T human);
    boolean addParent(T human);
    String getName();
    LocalDate getDeathDate();
    LocalDate getBirthDate();
    List<T> getParents();
    List<T> getChildren();
    T getSprouse();
    void setSprouse(T human);

}