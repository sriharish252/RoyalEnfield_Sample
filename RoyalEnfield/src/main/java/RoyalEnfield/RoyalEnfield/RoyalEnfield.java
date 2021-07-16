package RoyalEnfield.RoyalEnfield;

import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

/*EnableEurekaClient is mandatory for all applications registering in EurekaServer.
 * This will application is assigned a name in the Eureka Server.
 * That name is used to locate this client through Eureka Server.
 */
//@EnableEurekaClient
public class RoyalEnfield {

	public static void main(String[] args) {
		SpringApplication spr=new SpringApplication(RoyalEnfield.class); //2nd way 
		System.out.println("Enter port no "); 
		Scanner scan=new Scanner(System.in);
		int port=scan.nextInt();//User will type the port no. For ex: 9060
		HashMap portconf=new HashMap(); portconf.put("server.port", port);
		spr.setDefaultProperties(portconf);
		spr.run(args);
	}
	
}
