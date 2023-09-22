package com.topsion.feature.virtualThread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualThreadTaskTest {

    @Test
    void should_execute_with_virtual_thread() {
        VirtualThreadTask virtualThreadTask = new VirtualThreadTask();
        virtualThreadTask.executeWithVirtualThread();
    }

}