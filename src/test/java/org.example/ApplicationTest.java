package org.example;

import org.eclipse.jetty.server.Server;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ApplicationTest {


    @Test
    public void mainTest()  {

        Application mockApplication = mock(Application.class);
        mockApplication.getPort();

    }
}

