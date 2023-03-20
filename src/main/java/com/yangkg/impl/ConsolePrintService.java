package com.yangkg.impl;

import com.yangkg.PrintService;

public class ConsolePrintService implements PrintService {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
