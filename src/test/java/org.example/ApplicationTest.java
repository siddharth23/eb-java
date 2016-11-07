package org.example;

import junit.framework.Assert;
import org.eclipse.jetty.server.Server;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApplicationTest {


    @Ignore
    public void mainTest()  {

        Application mockApplication = mock(Application.class);
        when(mockApplication.getPort()).thenReturn(8080);
        Assert.assertEquals(mockApplication.getPort(),8080);

    }
}

