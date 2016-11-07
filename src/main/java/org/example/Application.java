package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import static org.example.MainEntryPoint.getPort;

public class Application extends AbstractHandler{

    public static void main(String[] args) throws Exception {
        ServerInjector temp = new ServerInjector(new Server(getPort()), new MainEntryPoint());
        temp.start();
    }
}

