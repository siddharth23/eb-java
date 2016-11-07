package org.example;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.example.Application;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

class MainEntryPoint {

    public static int getPort() {
        try {
            return Integer.parseInt(System.getenv().get("PORT"));
        } catch (Exception e) {
            return 8080;
        }
    }


}