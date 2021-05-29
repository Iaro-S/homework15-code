package ro.fasttrackit.homework15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.offset;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConvertTemperatureTest {
    ConvertTemperature convertTemperature;

    @BeforeEach
    void setup() {
        convertTemperature = new ConvertTemperature();
    }

    @Test
    @DisplayName("conversion from  fahrenheit to celsius works")
    void fahrenheitToCelsius() {
        assertThat(convertTemperature.fahrenheitToCelsius(100)).isEqualTo(37.77777777777778);
        assertThat(convertTemperature.fahrenheitToCelsius(0)).isEqualTo(-17.77777777777778);
        assertThat(convertTemperature.fahrenheitToCelsius(50)).isEqualTo(10);
    }

    @Test
    @DisplayName("conversion from celsius to fahrenheit works")
    void celsiusToFahrenheit() {
        assertThat(convertTemperature.celsiusToFahrenheit(30)).isEqualTo(86);
        assertThat(convertTemperature.celsiusToFahrenheit(0)).isEqualTo(32);
        assertThat(convertTemperature.celsiusToFahrenheit(-20)).isEqualTo(-4);
    }

    @Test
    @DisplayName("conversion from kelvin to celsius works")
    void kelvinToCelsius() {
        assertThat(convertTemperature.kelvinToCelsius(300)).isEqualTo(26.85,offset(0.1));
        assertThat(convertTemperature.kelvinToCelsius(273.15)).isEqualTo(0.00);
        assertThat(convertTemperature.kelvinToCelsius(260)).isEqualTo(-13.15,offset(0.1));
    }

    @Test
    @DisplayName("conversion from celsius to kelvin works")
    void celsiusToKelvin() {
        assertThat(convertTemperature.celsiusToKelvin(0)).isEqualTo(273.15);
        assertThat(convertTemperature.celsiusToKelvin(20)).isEqualTo(293.15);
        assertThat(convertTemperature.celsiusToKelvin(-20)).isEqualTo(253.14,offset(0.1));
    }

    @Test
    @DisplayName("conversion from kelvin to fahrenheit")
    void kelvinToFahrenheit() {
        assertThat(convertTemperature.kelvinToFahrenheit(0)).isEqualTo(-459.66,offset(0.1));
        assertThat(convertTemperature.kelvinToFahrenheit(255)).isEqualTo(-0.66,offset(0.1));
        assertThat(convertTemperature.kelvinToFahrenheit(100)).isEqualTo(-279.66,offset(0.1));
    }

    @Test
    @DisplayName("conversion from fahrenheit to kelvin")
    void fahrenheitToKelvin() {
        assertThat(convertTemperature.fahrenheitToKelvin(0)).isEqualTo(255.37,offset(0.1));
        assertThat(convertTemperature.fahrenheitToKelvin(-100)).isEqualTo(199.816,offset(0.1));
        assertThat(convertTemperature.fahrenheitToKelvin(100)).isEqualTo(310.927,offset(0.1));

    }
}

