package edu.jacob.security.jwt.config;

import org.springframework.security.web.RedirectStrategy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NoRedirectStrategy implements RedirectStrategy {
    /**
     * Performs a redirect to the supplied URL
     *
     * @param request  the current request
     * @param response the response to redirect
     * @param url      the target URL to redirect to, for example "/login"
     */
    @Override
    public void sendRedirect(HttpServletRequest request, HttpServletResponse response, String url) throws IOException {

    }
}
