package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer{
    @Override
    public void write() {
        System.out.println("Writing using Pencil");
    }
}
