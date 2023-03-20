package com.develhope.Environments.Variables1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Value("${myCustomVariableTree.authCode}")
    private String authCode;

    @Value("${myCustomVariableTree.devName}")
    private String devName;

    @GetMapping("/getProperty")
    public String getProperty() {
        return "Authcode: " + authCode + " Dev name: " + devName;
    }
}
