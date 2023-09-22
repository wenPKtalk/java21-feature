package com.topsion.feature.sequencedCollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FeatureOfCollectionTest {

    @Test
    void operateCollectionWithSequenced() {
        List<Integer> collection = new ArrayList<>();
        collection.add(2);
        collection.add(3);
        FeatureOfCollection featureOfCollection = new FeatureOfCollection();
        featureOfCollection.operateCollectionWithSequenced(collection);
    }
}