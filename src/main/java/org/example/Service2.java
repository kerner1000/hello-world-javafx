package org.example;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class Service2 extends Service<Void> {

    static final int workLoad = 100;

    @Override
    protected Task<Void> createTask() {

        return new Task<>() {
            @Override
            protected Void call() throws Exception {
                updateMessage("Starting Task #2..");
                for (int i = 0; i < workLoad; i++) {
                    Thread.sleep(200);
                    updateProgress(i, workLoad);
                    updateMessage(i + " elements done");
                }
                updateMessage("Task #2 done!");
                return null;
            }
        };
    }
}
