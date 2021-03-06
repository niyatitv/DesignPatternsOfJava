package com.niyati.designpattern.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BuilderDesignPatternTest {
    @Test
    public void shouldGetPhoneFeatures() {
        Phone phone = new PhoneBuilder().setOs("Iphone").setRam(6).setBattery(3000).getPhone();
        assertEquals("Phone: os=Iphone, processor= null, ram=6, battery=3000", phone.toString());

    }

}


