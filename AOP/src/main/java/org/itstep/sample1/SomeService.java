package org.itstep.sample1;

import org.springframework.stereotype.Service;

@Service
public class SomeService {
    @LogExecutionTime
    public void someMethod() throws InterruptedException {
        Thread.sleep(1000);
    }
}
