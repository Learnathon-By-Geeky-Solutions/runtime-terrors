package com.example.SpringJBDCConnection;

import com.example.SpringJBDCConnection.model.Speaker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

class SpringJbdcConnectionApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testGetSpeakers() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Speaker>> speakerResponse = restTemplate.exchange("http://localhost:9090/speakers", org.springframework.http.HttpMethod.GET, null, new org.springframework.core.ParameterizedTypeReference<List<Speaker>>() {
		});
		assertTrue(speakerResponse.getBody() != null ,"Body is null");
	}
	@Test
	public void testCreateSpeaker() {
		RestTemplate restTemplate = new RestTemplate();
		Speaker speaker = new Speaker();
		speaker.setName(" Sazidur Rahman Mahin");
		restTemplate.put("http://localhost:9090/speakers", speaker);
	}

}
