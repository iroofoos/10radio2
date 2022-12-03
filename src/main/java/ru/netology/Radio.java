package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsCount;

    public Radio() {
        this.stationsCount = 10;
    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public void nextStation() {
        if (currentStation < stationsCount - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = stationsCount - 1;
        }
    }

    public void nextVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationsCount - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}