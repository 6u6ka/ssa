package ssa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class RestTemplateProductTest {
	@Test
	public void testName() throws Exception {
		Product restTemplate = new RestTemplate()
				.getForObject("http://54.187.25.219:8091/api/item/1cf837a5-f927-4de5-bc16-88e6fd06eef9", Product.class);
		assertThat(restTemplate.getName()).isEqualTo("ピザポテト");
	}

}
