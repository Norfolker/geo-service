package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {

    @Test
    public void byIp() {

        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        String ip = "172.0.32.11";

        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp(ip);

        Assertions.assertEquals(expected, actual);
    }
}
