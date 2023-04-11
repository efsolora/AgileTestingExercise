package com.sofkau.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LoadCredentials {

    public static List<String> getCredentials(String pageName) throws IOException {
        List<String> credentials = new ArrayList<>();
        Properties p = new Properties();
        p.load(new FileInputStream(new File("src/test/resources/file.properties")));
        seleccionarCredenciales(pageName, credentials, p);
        return credentials;
    }

    private static void seleccionarCredenciales(String pageName, List<String> credentials, Properties p) {
        switch (pageName){
            case "exito":
                credentials.add(p.getProperty("USEREXITO"));
                credentials.add(p.getProperty("PASSWORDEXITO"));
                break;
            case "automation":
                credentials.add(p.getProperty("USERAUTOMATION"));
                credentials.add(p.getProperty("PASSWORDAUTOMATION"));
                break;
            case "falabella":
                credentials.add(p.getProperty("USERFALABELLA"));
                credentials.add(p.getProperty("PASSWORDFALABELLA"));
        }
    }

}


