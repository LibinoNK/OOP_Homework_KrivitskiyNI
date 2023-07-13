package Homework.Human.Comparators;

import Homework.Human.Human;
import Homework.Tree.FamilyTreeItem;

import java.util.Comparator;

public class HumanComporatorByChildren<E extends FamilyTreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {return Integer.compare(o1.getChildren().size(), o2.getChildren().size());}
}
