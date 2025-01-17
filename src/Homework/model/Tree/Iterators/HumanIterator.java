package Homework.model.Tree.Iterators;

import java.util.Iterator;
import java.util.List;

public class HumanIterator<E> implements Iterator<E> {
    private int index;
    private List<E> familyList;

    public HumanIterator(List<E> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return index < familyList.size();
    }

    @Override
    public E next() {
        return familyList.get(index++);
    }
}
