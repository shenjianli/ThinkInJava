package com.shen.think.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import javax.security.auth.login.LoginException;

/**
 * Created by ljq on 2017/12/15.
 */

public class LogginExceptions{

    public static void main(String[] args){
        try {
            throw new LogginException();
        } catch (LogginException e) {
            System.err.println("Caught " + e);
        }

        try {
            throw new LogginException();
        } catch (LogginException e) {
            System.err.println("Caught " + e);
        }
    }
}
