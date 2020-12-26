package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest {

    @Test
    public void locale() {

        Country country = Country.RUSSIA;
        String expected = "Добро пожаловать";
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(country);

        Assertions.assertEquals(expected, actual);
    }
}
