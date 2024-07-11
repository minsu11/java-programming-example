package org.example.comparable;

import java.util.Comparator;

public class TestComparator implements Comparator<Test> {

    @Override
    public int compare(Test o1, Test o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
