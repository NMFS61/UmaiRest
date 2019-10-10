package nmfs.umairest.service;

import nmfs.umairest.util.CONSTANTS;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class SmsService {

	private final RestTemplate restTemplate;

	public SmsService() {
		restTemplate = new RestTemplate();
	}

	public void someRestCall(String reciepent,String msg) throws URISyntaxException {

		URI uri = new URI(CONSTANTS.SMS_URL);
        HttpHeaders headers = new HttpHeaders();
		//headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization",CONSTANTS.SMS_ACCESSTOKEN);
		System.out.println(reciepent+":"+msg);
		String testJSONStr="{\n" +
				"\"originator\":\""+CONSTANTS.SMS_ORIGINATOR+"\",\n" +
				"\"recipients\":\""+reciepent+"\",\n" +
				"\"body\":\""+msg+"\"\n" +
				"}";

//		personJsonObject = new JSONObject();
//		personJsonObject.put("id", 1);
//		personJsonObject.put("name", "John");
//		HttpEntity<String> request = new HttpEntity<String>(personJsonObject.toString(), headers);

		HttpEntity<String> request = new HttpEntity<String>(testJSONStr, headers);

		ResponseEntity<String> responseEntityStr = restTemplate.
				postForEntity(uri, request, String.class);
	}

}