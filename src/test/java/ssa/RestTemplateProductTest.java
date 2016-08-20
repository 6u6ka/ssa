package ssa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class RestTemplateProductTest {

	@Test
	public void testName() throws Exception {
		Product restTemplate = new RestTemplate().getForObject(
				"http://54.173.107.241:8091/api/item/e2490894-cd1f-41cc-8d8d-e6abaa0b00e2", Product.class);
		assertThat(restTemplate.getName()).isEqualTo("ピザポテト");
	}

}
