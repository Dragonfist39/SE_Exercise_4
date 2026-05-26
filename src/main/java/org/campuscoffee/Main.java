package org.campuscoffee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Search search = new Search();
        System.out.println(search.getStoresClose(Location.UNI));
    }
}
