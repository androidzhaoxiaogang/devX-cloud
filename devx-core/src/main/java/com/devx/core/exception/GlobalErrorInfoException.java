package com.devx.core.exception;


import com.devx.core.enums.ErrorInfo;

/**
 * Created by sungang on 2017/5/19.
 */
public class GlobalErrorInfoException extends RuntimeException {

    private ErrorInfo errorInfo;
    private Object[] args;

    public GlobalErrorInfoException(ErrorInfo errorInfo, Object... agrs) {
        this.errorInfo = errorInfo;
        this.args = agrs;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }


    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }
}
