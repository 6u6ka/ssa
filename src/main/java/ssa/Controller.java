package ssa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Controller

@RequestMapping("")
public class Controller {

	@RequestMapping("")
	public String index(Model model) {
		return "prototype";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String result(Model model) {
		Product[] product = new RestTemplate().getForObject("http://54.173.107.241:8091/api/item", Product[].class);
		model.addAttribute(product);
		return "prototype";
	}

	/**
	 * 検索ボタンをおしたら動くはず。
	 *
	 * @return prototype
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String search(Model model) {
		Product[] product = new RestTemplate().getForObject("http://54.173.107.241:8091/api/item", Product[].class);
		model.addAttribute(product);
		return "prototype";
	}
}
