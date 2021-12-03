package com.mistertoo.pizzawebsite;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mistertoo.pizzawebsite.entity.Nutriments;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestServiceClient {
    Logger logger = LogManager.getLogger(this.getClass());
    @Test
    public void testswapiJSON() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://world.openfoodfacts.org/api/v0/product/737628064502.json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Nutriments nutriments = mapper.readValue(response,Nutriments.class);
        assertEquals(0, nutriments.getEnergyKcal());
    }
}
