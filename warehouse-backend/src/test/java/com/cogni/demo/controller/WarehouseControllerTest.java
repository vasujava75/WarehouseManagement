package com.cogni.demo.controller;

import com.cogni.demo.WarehouseApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WarehouseApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WarehouseControllerTest {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    void getVehicles() {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        @SuppressWarnings("rawtypes")
        ResponseEntity<List> response = restTemplate.exchange(
                createURLWithPort("/warehouses/v1"), HttpMethod.GET, entity,
                List.class);

        assertNotNull(response.getBody());
    }
    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}