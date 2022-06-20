package it.ziliani;


import javax.swing.JOptionPane;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;



@EnableConfigurationProperties
@SpringBootApplication
public class AppBuilder {

	public static ApplicationContext context;
	private static String portNumber = "5656";
	private static IconTray1 ic;
	
	
	//getter setter
	public static String getPortNumber() {
		return portNumber;
	}
	public static void setPortNumber(String portNumber) {
		AppBuilder.portNumber = portNumber;
	}
	
	
	
	
	
	
	public static void appBuilder() {
		try {
			
			
			
	System.setProperty("server.port", portNumber);	
	SpringApplicationBuilder builder = new SpringApplicationBuilder(ApplicationSrv1.class);
	
    builder.headless(false);
  
    context = builder.run();
    setIc(new IconTray1());
		}
	 catch (org.springframework.context.ApplicationContextException err ) {
		 final int exitCode = 0;
		    ExitCodeGenerator exitCodeGenerator = new ExitCodeGenerator() {

		        @Override
		        public int getExitCode() {
		          return exitCode;
		        }

		      };
			JOptionPane.showMessageDialog( 
					  null, 
					  "Port " + portNumber + " Already in use \n or Wrog Port Number!!!","WARNING.",
					  JOptionPane.WARNING_MESSAGE, null);
			
			SpringApplication.exit(ApplicationSrv1.context, exitCodeGenerator);
			
			
			
			}
		
	//	catch (com.mysql.jdbc.exceptions.jdbc4.CommunicationsException jdbcExc) {}
	
		}
	
	public static IconTray1 getIc() {
		return ic;
	}
	public static void setIc(IconTray1 ic) {
		AppBuilder.ic = ic;
	}
	
}
