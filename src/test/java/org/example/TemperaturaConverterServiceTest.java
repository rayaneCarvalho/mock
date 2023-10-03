package org.example;

import org.easymock.EasyMock;
import org.example.TemperaturaConverterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperaturaConverterServiceTest {

    private TemperaturaConverterService temperaturaConverterService;

    @BeforeEach
    public void setUp() {
        temperaturaConverterService = EasyMock.createMock(TemperaturaConverterService.class);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        // Define o comportamento do mock
        EasyMock.expect(temperaturaConverterService.convertCelsiusToFahrenheit(25.0)).andReturn(77.0);
        EasyMock.replay(temperaturaConverterService);

        // Crie uma instância real do serviço, se preferir
        // TemperatureConverterService temperaturaConverterService = new TemperatureConverterService();

        // Chama o método do serviço
        double result = temperaturaConverterService.convertCelsiusToFahrenheit(25.0);

        // Verifica se o resultado é o esperado
        assertEquals(77.0, result, 0.01); // Usamos uma margem de erro de 0.01 para lidar com arredondamentos

        // Verifica se o mock foi usado corretamente
        EasyMock.verify(temperaturaConverterService);
    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        // Define o comportamento do mock
        EasyMock.expect(temperaturaConverterService.convertFahrenheitToCelsius(77.0)).andReturn(25.0);
        EasyMock.replay(temperaturaConverterService);

        // Chama o método do serviço
        double result = temperaturaConverterService.convertFahrenheitToCelsius(77.0);

        // Verifica se o resultado é o esperado
        assertEquals(25.0, result, 0.01); // Usamos uma margem de erro de 0.01 para lidar com arredondamentos

        // Verifica se o mock foi usado corretamente
        EasyMock.verify(temperaturaConverterService);
    }
}
