package com.shen.think.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by ljq on 2017/12/15.
 */

public class LogginException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LogginException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
