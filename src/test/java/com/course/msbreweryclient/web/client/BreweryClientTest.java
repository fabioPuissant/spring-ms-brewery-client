package com.course.msbreweryclient.web.client;

import com.course.msbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void testGetBeerId() {
        BeerDto dto = client.getBeerId(UUID.randomUUID());

        assertNotNull(dto);

    }

    @Test
    void testSaveNewBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Testing Beer").build();
        URI uri = client.saveNewBeer(beerDto);

        assertNotNull(uri);
        System.out.println(uri.toString());
    }
}