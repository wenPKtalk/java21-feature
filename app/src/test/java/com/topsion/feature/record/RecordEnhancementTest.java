package com.topsion.feature.record;

import org.junit.jupiter.api.Test;

class RecordEnhancementTest {

    @Test
    public void should_pattern_no_get_value() {
        RecordEnhancement.Point point = new RecordEnhancement.Point(4, 5);
        RecordEnhancement recordEnhancement = new RecordEnhancement();
        recordEnhancement.patternRecord(point);
    }

    @Test
    public void should_switch_feature() {
        RecordEnhancement.Point point = new RecordEnhancement.Point(4, 5);
        RecordEnhancement recordEnhancement = new RecordEnhancement();
        recordEnhancement.printSwitch(point);
        recordEnhancement.printSwitch("Hello new record");
        recordEnhancement.printSwitch(12);
    }
}