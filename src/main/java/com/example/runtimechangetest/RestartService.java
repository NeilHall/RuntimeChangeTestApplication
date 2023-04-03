package com.example.runtimechangetest;

import org.springframework.cloud.context.restart.RestartEndpoint;
import org.springframework.stereotype.Service;

@Service
public class RestartService {

    private final RestartEndpoint restartEndpoint;

    public RestartService(RestartEndpoint restartEndpoint) {
        this.restartEndpoint = restartEndpoint;
    }

    public void restartApp() {
        restartEndpoint.restart();
    }

}
