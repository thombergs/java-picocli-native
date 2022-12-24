package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
public class PicoCliRunner implements CommandLineRunner, ExitCodeGenerator {

    private Integer exitCode = 0;

    private final MyCommand command;

    private final CommandLine.IFactory picoCliFactory;

    public PicoCliRunner(MyCommand command, CommandLine.IFactory picoCliFactory) {
        this.command = command;
        this.picoCliFactory = picoCliFactory;
    }

    @Override
    public void run(String... args) throws Exception {
        this.exitCode = new CommandLine(command, picoCliFactory).execute(args);
    }

    @Override
    public int getExitCode() {
        return this.exitCode;
    }
}
