package it.antonio;

import java.io.File;

import javax.naming.Context;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class Main {

	public static void main(String[] args) {

		// Server web java
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        org.apache.catalina.Context ctx = tomcat.addContext("/antonio", new File(".").getAbsolutePath());
        
        PrimaServlet primaServlet = new PrimaServlet();
        
        Tomcat.addServlet(ctx, "antonio", primaServlet);

        ctx.addServletMapping("/*", "antonio");

        try {
			tomcat.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        tomcat.getServer().await();
	}

}

