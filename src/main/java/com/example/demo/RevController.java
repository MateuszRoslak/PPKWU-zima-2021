package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevController {
    StringBuilder builder = new StringBuilder();
    @GetMapping("/rev")
    @ResponseBody
    public String getParam(@RequestParam String param) {
        builder.append(param);
        builder.reverse();
        return builder.toString();
    }
}
