package org.example;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int count =0;
        while (true) {
            Thread.sleep(2*1000);
            System.out.println("Jetzt gehts los");
            System.out.println(format("App running new app... %d", count++));
        }
    }
}
