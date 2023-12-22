package kz.job4j.di;

import kz.job4j.di.service.ConsoleInput;
import kz.job4j.di.service.Context;
import kz.job4j.di.model.StartUI;
import kz.job4j.di.model.Store;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.askAndAdd("Ivan ivanov2");
        ui.add("Ivan ivanov3");
        ui.print();
    }
}
