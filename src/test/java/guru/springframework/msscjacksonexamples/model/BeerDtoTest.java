package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"id\":\"978f0d76-3892-4626-b8c4-1ef5aaa1adb1\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":2134141244,\"price\":12.99,\"createdDate\":\"2020-09-10T10:53:25.6922521+03:00\",\"lastUpdatedDate\":\"2020-09-10T10:53:25.6926589+03:00\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}