package java9r.controller.com;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java9r.entities.com.ProductXml;
 

@RestController
@RequestMapping("product")
public class ProductController {
	 
	@RequestMapping("/")
	public String index() { 
		return "Welcome to RestTemplate Example. ";
	}

	@RequestMapping("/name/{product}")
	public ProductXml message(@PathVariable String product) {//REST Endpoint.

		ProductXml output = new ProductXml(product, " Product  " + product);
		return output;
	}
 
	 
}
