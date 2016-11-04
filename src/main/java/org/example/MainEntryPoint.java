package org.example;

import org.eclipse.jetty.server.Server;

import static org.example.Application.getPort;

/**
 * Created by siddharthkala on 11/4/16.
 */
public class MainEntryPoint {

    public static void main(String[] args) throws Exception {
        ServerInjector temp = new ServerInjector(new Server(getPort()), new Application());
        temp.start();
    }
}
