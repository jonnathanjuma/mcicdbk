package ec.com.mcicdbk.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/m")
@RestController
public class MantenimientoWs {

	@GetMapping("/prueba")
	public String prueba () {
		return "funciona";
	}
	
}
