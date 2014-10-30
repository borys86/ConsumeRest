package hello;

import org.springframework.web.client.RestTemplate;

public class Application {

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		PageList pageList = restTemplate.getForObject("http://localhost:8080/users", PageList.class);

		for (Page page : pageList) {
			System.out.println("Id:    " + page.getId());
			System.out.println("Password:   " + page.getPassword());
		}
	}
}
