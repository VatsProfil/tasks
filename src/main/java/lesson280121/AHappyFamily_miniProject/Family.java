package lesson280121.AHappyFamily_miniProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Family {


    private List<Human> listChildren = new ArrayList<>();
    private Set<Pet> setPet = new HashSet<>();

    public List<Human> getListChildren() {
        return listChildren;
    }

    public void setListChildren(List<Human> listChildren) {
        this.listChildren = listChildren;
    }

    public Set<Pet> getSetPet() {
        return setPet;
    }

    public void setSetPet(Set<Pet> setPet) {
        this.setPet = setPet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "listChildren=" + listChildren +
                ", setPet=" + setPet +
                '}';
    }
}
