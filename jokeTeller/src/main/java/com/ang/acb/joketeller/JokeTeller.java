package com.ang.acb.joketeller;

import java.util.Random;

public class JokeTeller {

    private final String[] jokes = {
            "This is a funny joke",
            "This is also a funny joke",
            "And this one too!"
    };

    public String tellJoke() {
        int jokeIndex = new Random().nextInt(jokes.length);
        return jokes[jokeIndex];
    }
}
