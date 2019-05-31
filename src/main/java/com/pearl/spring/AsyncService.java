package com.pearl.spring;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

//    @Async("processExecutor")
    @Async
    public void sayHello(){
        System.out.println("INNER THREAD : "+ Thread.currentThread().getName());
        try {
            Thread.sleep(6000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from "+ Thread.currentThread().getId());
    }
}
