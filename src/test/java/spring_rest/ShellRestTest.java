package spring_rest;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.domain.Command;
import com.example.domain.FileInformation;

public class ShellRestTest {

	@Test
	public void testMethod() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		RestTemplate template = new RestTemplate();

		HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);

		ResponseEntity<Command> entity = template.postForEntity("http://localhost:8080/command/cmd", requestEntity, Command.class);

		String path = entity.getHeaders().getLocation().getPath();

		assertEquals(HttpStatus.CREATED, entity.getStatusCode());
		assertTrue(path.startsWith("/aggregators/orders/"));
		Command order = entity.getBody();

		
	}
}
