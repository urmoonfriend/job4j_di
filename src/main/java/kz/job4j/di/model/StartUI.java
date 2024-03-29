package kz.job4j.di.model;

import kz.job4j.di.service.ConsoleInput;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope("prototype")
public class StartUI {

    @Autowired
    private Store store;

    @Autowired
    private ConsoleInput consoleInput;

    public void askAndAdd(String value) {
        consoleInput.askStr(value);
        store.add(value);
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}