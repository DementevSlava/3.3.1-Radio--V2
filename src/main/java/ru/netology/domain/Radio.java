package ru.netology.domain;

public class Radio {
    private int numberStation;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        this.maxNumberStation = getMaxNumberStation();
    }

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public void increaseNumberStation() {
        if (numberStation < maxNumberStation) {
            this.numberStation++;
            return;
        }
        this.numberStation = minNumberStation;
    }

    public void decreaseNumberStation() {
        if (numberStation > minNumberStation) {
            this.numberStation--;
            return;
        }
        this.numberStation = maxNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > maxNumberStation) {
            this.numberStation = maxNumberStation;
            return;
        }
        if (numberStation < minNumberStation) {
            this.numberStation = minNumberStation;
            return;
        }
        this.numberStation = numberStation;
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            return;
        }
        this.volume++;

    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            return;
        }
        this.volume--;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            this.volume = maxVolume;
            return;
        }
        if (volume < minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }
}
