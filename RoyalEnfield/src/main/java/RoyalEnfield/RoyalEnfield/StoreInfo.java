package RoyalEnfield.RoyalEnfield;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bikes")
public class StoreInfo {

	@RequestMapping(value="/info")
	public String getStoreInfo(HttpServletRequest  request, HttpServletResponse response)
	{
		String res="<html><body><B>Instance Name : " + request.getLocalName() + "<BR>";
		res += "<B>Port : </B>" +  + request.getLocalPort() + "<BR>";
		res += "<ol><li>ThunderBird</li><li>Classic<li><li>Bullet</li><li>Meteor</li>";
		res += "<li>ContinentalGT</li><li>CafeRacer</li><li>Himalayan</li><li>Interceptor</li>";
		res += "</body></html>";
		return res;
	}
}
