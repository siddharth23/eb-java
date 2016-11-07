package org.example;

import org.eclipse.jetty.server.Server;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ServerInjectorTest {


    @Test(expected = Exception.class)
    public void mainTest() throws Exception {
        Server mockServer = mock(Server.class);
        MainEntryPoint mockApplication = mock(MainEntryPoint.class);
        ServerInjector temp = new ServerInjector(mockServer, mockApplication);
        temp.start();

    }
}

