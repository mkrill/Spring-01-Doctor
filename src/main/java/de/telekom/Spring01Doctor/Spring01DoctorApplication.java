package de.telekom.Spring01Doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Spring01DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring01DoctorApplication.class, args);
	}

	// List of URLs
	@RequestMapping("/")
	@ResponseBody
	public String index() {
	    String returnPage;
		
	    returnPage = "<!doctype html>\n<html>\n<header></header><body><ul>\n";
	    returnPage += "<li><a href=/doctor/1>/doctor/1: William Hartnell</a></li>\n";
	    returnPage += "<li><a href=/doctor/1>/doctor/2: Patrick Troughton</a></li>\n";
	    returnPage += "<li><a href=/doctor/1>/doctor/3: Jon Pertwee</a></li>\n";
	    returnPage += "<li><a href=/doctor/1>/doctor/4: Tom Baker</a></li>\n";
	    returnPage += "</ul>\n</body>\n</html>\n";
	    return returnPage;
	}
	
	// William Hartnell
	@RequestMapping("/doctor/1")
	@ResponseBody
	public String page1() {
	    return "Greetings from William Hartnell!";
	}
	
	// Patrick Troughton
	@RequestMapping("/doctor/2")
	@ResponseBody
	public String page2() {
	    return "Greetings from Patrick Troughton!";
	}
	
	// Jon Pertwee
	@RequestMapping("/doctor/3")
	@ResponseBody
	public String page3() {
	    return "Greetings from Jon Pertwee!";
	}
	
	// Tom Baker
	@RequestMapping("/doctor/4")
	@ResponseBody
	public String page4() {
	    return "Greetings from Tom Baker!";
	}
	

}
