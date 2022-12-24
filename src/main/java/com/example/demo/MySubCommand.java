package com.example.demo;

import org.springframework.stereotype.Component;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@Component
@CommandLine.Command(
        name = "test", mixinStandardHelpOptions = true
)
class MySubCommand implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Hello World");
        return 0;
    }
}