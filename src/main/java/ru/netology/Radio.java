package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;


    public void less() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
    }

    public void more() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        } else {
            currentVolume = 100;
        }
    }

    public void next() {
        if (currentStation != 9) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <= 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }


}
