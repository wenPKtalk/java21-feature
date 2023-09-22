package com.topsion.feature.virtualThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadTask {
    public void executeWithVirtualThread() {
        Runnable runnable = () -> {
            System.out.println("Hello virtual thread feature!");
        };

        // 1
        Thread.startVirtualThread(runnable);

        //2
        Thread virtualThread = Thread.ofVirtual().start(runnable);
        System.out.println("current thread is virtual: " + virtualThread.isVirtual());

        //3
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            executorService.submit(runnable);
        }
    }
}
