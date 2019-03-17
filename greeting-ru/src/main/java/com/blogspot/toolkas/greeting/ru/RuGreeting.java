package com.blogspot.toolkas.greeting.ru;

import com.blogspot.toolkas.greeting.api.*;

public class RuGreeting implements Greeting {
    public String getMessage() {
        return "Привет, мир!";
    }
}