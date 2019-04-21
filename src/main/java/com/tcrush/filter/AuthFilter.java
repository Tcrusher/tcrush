package com.tcrush.filter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebFilter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@Component
@Service
@WebFilter(urlPatterns = "/*",filterName = "authFilter")
public class AuthFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
