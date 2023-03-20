package com.yangkg;

import java.util.ServiceLoader;

public class TestSPI {
    public static void main(String[] args) {
        ServiceLoader<PrintService> loader = ServiceLoader.load(PrintService.class);
        for (PrintService printService : loader) {
            printService.print("Hello, world!");
        }
    }
}
