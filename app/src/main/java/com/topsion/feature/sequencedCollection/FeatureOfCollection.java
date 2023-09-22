package com.topsion.feature.sequencedCollection;

import java.util.List;

public class FeatureOfCollection {
    public void operateCollectionWithSequenced(List<Integer> collection) {
        collection.addFirst(1);
        System.out.println("Will first is: "+collection.getFirst());
        collection.addLast(0);
        System.out.println("Will last is: "+collection.getLast());
    }
}
