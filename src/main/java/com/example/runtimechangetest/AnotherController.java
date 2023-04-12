package com.example.runtimechangetest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/more")
@RequiredArgsConstructor
@Slf4j
public class AnotherController {
    final ConfigProperties configProperties;
    @GetMapping
    public String doMore() {
        log.info(configProperties.getValue());
        return "check the logs again";
    }
}
