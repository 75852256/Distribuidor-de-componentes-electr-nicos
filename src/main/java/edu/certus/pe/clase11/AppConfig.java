package edu.certus.pe.clase11;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/api")
public class AppConfig extends ResourceConfig {
    public  AppConfig() { packages("edu.certus.pe.recurso");}
}
