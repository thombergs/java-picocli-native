package com.example.demo;

import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
@CommandLine.Command(
        name = "main",
        mixinStandardHelpOptions = true,
        subcommands = MySubCommand.class
)
class MyCommand{

}