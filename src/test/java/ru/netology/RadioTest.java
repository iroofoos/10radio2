package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.nextVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.nextVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolumeInTheMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.prevVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.prevVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}