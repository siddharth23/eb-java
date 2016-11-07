package org.example;

import org.eclipse.jetty.server.Server;

public class ServerInjector {
    public final Server server;
    public final Application application;

    public ServerInjector(Server server, Application application){
        this.server = server;
        this.application = application;
    }

    public void start() throws Exception {
        server.start();
        server.join();
    }
}
