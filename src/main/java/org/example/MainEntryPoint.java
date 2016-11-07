package org.example;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.example.Application;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

class MainEntryPoint extends AbstractHandler {
    private static final int PAGE_SIZE = 3000;
    private static final String INDEX_HTML = loadIndex();

    private static String loadIndex() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Application.class.getResourceAsStream("/index.html")))) {
            final StringBuilder page = new StringBuilder(PAGE_SIZE);
            String line = null;

            while ((line = reader.readLine()) != null) {
                page.append(line);
            }

            return page.toString();
        } catch (final Exception exception) {
            return getStackTrace(exception);
        }
    }

    private static String getStackTrace(final Throwable throwable) {
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter, true);
        throwable.printStackTrace(printWriter);

        return stringWriter.getBuffer().toString();
    }

    public static int getPort() {
        try {
            return Integer.parseInt(System.getenv().get("PORT"));
        } catch (Exception e) {
            return 8080;
        }
    }

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println(INDEX_HTML);
    }


}