package com.smaga.core2;

import org.springframework.stereotype.Component;

@Component
public class Airplane implements Aircraft {
    @Override
    public String fly() {
        return this.getClass().getSimpleName() + " is flying";
    }
}
