package com.example.server.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

public class Response {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String devoloperMessage;
    protected Map<?, ?> data;
}
