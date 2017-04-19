package uconverter;

import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ShellFactory
                .createConsoleShell("hello", "This is Universal Converter", new UniversalConverter())
                .commandLoop();
    }

}
