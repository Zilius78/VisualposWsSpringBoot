package it.ziliani;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;

public class IconTray1 extends TrayIcon implements ExitCodeGenerator {

	private static final String IMAGE_PATH = "/vp16x16.png";
	private static String TOOLTIP =" Web Service is not running!!!";



	public static String getTOOLTIP() {
		return TOOLTIP;
	}

	public static void setTOOLTIP(String tOOLTIP) {
		TOOLTIP = tOOLTIP;
	}
	private PopupMenu popup;
	final SystemTray tray;
	
	
	
	public IconTray1() {
		
		super(createImage(IMAGE_PATH,TOOLTIP),TOOLTIP);
		popup= new PopupMenu();
		tray = SystemTray.getSystemTray();
		
		
		try 
		{
			setup();
			
			
			
			
		}catch(AWTException awe) {
			
			awe.printStackTrace();
		}
		
		
	}
	

	
	private void setup() throws AWTException{
		
		final MenuItem startItem = new MenuItem("START");
		
		final MenuItem stopItem = new MenuItem("STOP");
	    MenuItem exitItem = new MenuItem("Exit");
	    final MenuItem serverPortItem = new MenuItem("Server Port");
	    setToolTip("Web Service Start on port:  "+ AppBuilder.getPortNumber());
	    		//start menu
	    	popup.add(startItem);
	    	startItem.setEnabled(false);
	    	startItem.addActionListener(new ActionListener() {
	     	  

	   		@Override
	   		public void actionPerformed(ActionEvent e) {
	   		tray.remove(IconTray1.this);	
   			AppBuilder.appBuilder();
   			
   			stopItem.setEnabled(true);
   			serverPortItem.setEnabled(false);
   			startItem.setEnabled(false);
   			setToolTip("Web Service Start on port:  "+ AppBuilder.getPortNumber());
	   			
	   			
	   			}
	   		
	   		});
	    	
	    				//stop menu
            popup.add(stopItem);
	        stopItem.setEnabled(true);
	        stopItem.addActionListener(new ActionListener() {
		     	  

	   		@Override
	   		public void actionPerformed(ActionEvent e) {
	   			
   		    final int exitCode = 0;
            ExitCodeGenerator exitCodeGenerator = new ExitCodeGenerator() {

                   @Override
	                   public int getExitCode() {
	                     return exitCode;
	                   }
	             };
	             if(ApplicationSrv1.context!=null)
	             {
	            	 SpringApplication.exit(ApplicationSrv1.context, exitCodeGenerator);
	             }
	            stopItem.setEnabled(false);
	   			serverPortItem.setEnabled(true);
	   			startItem.setEnabled(true);
	   			setToolTip("Web Service STOP running on port: " + AppBuilder.getPortNumber());
	      		
	   			}

	   	
	   			});
	        popup.add(serverPortItem);
	        serverPortItem.setEnabled(false);
	        serverPortItem.addActionListener(new ActionListener() {
	     	  

	 		@Override
	 		public void actionPerformed(ActionEvent e) {
	 			
	 		String srvPortOptPane; 
	    		
	    		srvPortOptPane =  JOptionPane.showInputDialog("Insert server port Number!!!");
	    		AppBuilder.setPortNumber(srvPortOptPane);
	    		
	 		}

	 	
	 		});
	        popup.add(exitItem);
	        
	        exitItem.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent e) {
	                final int exitCode = 0;
	                ExitCodeGenerator exitCodeGenerator = new ExitCodeGenerator() {

	                    @Override
	                    public int getExitCode() {
	                      return exitCode;
	                    }

	                  };

	                  tray.remove(IconTray1.this);
	                  SpringApplication.exit(ApplicationSrv1.context, exitCodeGenerator);
	            }
	        });
	        setPopupMenu(popup);
	        tray.add(this);
		
		
		
	}

	@Override
	public int getExitCode() {
		
		return 0;
	};
	public static Image createImage(String path, String description){

	       URL imageURL = IconTray1.class.getResource(path);
	       if(imageURL == null){
	           System.err.println("Failed Creating Image. Resource not found: "+path);
	           return null;
	       }else {
	           return new ImageIcon(imageURL,description).getImage();
	       }
	   }
}
