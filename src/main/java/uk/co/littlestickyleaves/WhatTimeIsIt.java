package uk.co.littlestickyleaves;

import java.time.Clock;

/**
 * {A thing} to {do something} for {another thing}
 * -- for example, {this}
 * -- and also {this}
 */
// TODO fill in Javadoc
public class WhatTimeIsIt {

    public static void main(String[] args) {

        while (true) {
            try {
                Thread.sleep(1000L);
                System.out.println("Tick");
                Thread.sleep(1000L);
                System.out.println("Tock");
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); // Here!
                throw new RuntimeException(ex);
            }
        }
    }
}
