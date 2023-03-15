package sn.m2gl.m2glcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class M2glciCdActionsApplication {

	@GetMapping("/home")
	public String welcome(){
		return "Bonjour la classe!";
	}
	public static void main(String[] args) {
		SpringApplication.run(M2glciCdActionsApplication.class, args);
	}
	// echo "# m2gl-devops-cicd" >> README.md
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main
	// git remote add origin https://github.com/diamanka-sn/m2gl-devops-cicd.git
	// git push -u origin main
}
