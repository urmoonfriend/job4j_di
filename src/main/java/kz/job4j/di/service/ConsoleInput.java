package kz.job4j.di.service;

import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}