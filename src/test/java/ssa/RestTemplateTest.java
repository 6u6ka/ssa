package ssa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {

	@Test
	public void 製品とつながるテスト() throws Exception {
		Product[] products = new RestTemplate().getForObject("http://54.186.114.166:8091/api/item", Product[].class);
		assertThat(products).isNotEmpty();
	}
}
