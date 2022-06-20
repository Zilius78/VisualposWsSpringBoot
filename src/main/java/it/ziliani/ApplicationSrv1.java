package it.ziliani;

import java.awt.AWTException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ApplicationSrv1 extends AppBuilder{

	public static void main(String[] args) throws AWTException {
		
		
		AppBuilder.appBuilder();
		
	}

}
