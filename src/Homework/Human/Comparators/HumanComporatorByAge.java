package Homework.Human.Comparators;

import Homework.Human.Human;
import Homework.Tree.FamilyTreeItem;

import java.util.Comparator;

public class HumanComporatorByAge<E extends FamilyTreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {return o1.getAge() - (o2.getAge());}
}
