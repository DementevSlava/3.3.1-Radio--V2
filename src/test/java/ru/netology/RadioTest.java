package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value= {
                    "'set correct station',1,2",
                    "'set min station',0,1",
                    "'set station is higher than maximum',20,0",
                    "'set max station',9,0",
                    "'set station below minimum',-3,1"
            }
    )

    public void nextNumberStation(String message, int setRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberStation(setRadioStation);
        radio.increaseNumberStation();
        assertEquals(expected, radio.getNumberStation(), message);
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "'set correct station',1,0",
                    "'set min station',0,9",
                    "'set station is higher than maximum',10,8",
                    "'set station below minimum',-3,9",
                    "'set max station',9,8"
            }
    )

    public void prevNumberStation(String message, int setRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberStation(setRadioStation);
        radio.decreaseNumberStation();
        assertEquals(expected, radio.getNumberStation(), message);
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "'set min correct station',0,0",
                    "'set middle orrect station',5,5",
                    "'set max correct station',9,9",
                    "'set station below minimum',-3,0",
                    "'set station is higher than maximum',15,9"
            }
    )

    public void setNumberStationManual(String message, int setRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberStation(setRadioStation);
        assertEquals(expected, radio.getNumberStation(), message);
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "'set min volume',0,1",
                    "'set middle volume',5,6",
                    "'set max volume',10,10",
                    "'set volume below minimum',-3,1",
                    "'set volume is higher than maximum',20,10"
            }
    )

    public void upVolume(String message, int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.increaseVolume();
        assertEquals(expected, radio.getVolume(), message);
    }

    @ParameterizedTest
    @CsvSource(
            value= {
                    "'set min volume',0,0",
                    "'set middle volume',5,4",
                    "'set max volume',10,9",
                    "'set volume below minimum',-3,0",
                    "'set volume is higher than maximum',20,9"
            }
    )

    public void downVolume(String message, int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolume(volume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getVolume(), message);
    }

}
