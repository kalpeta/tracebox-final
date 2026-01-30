package com.tracebox;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class VersionController {

  @Value("${spring.application.name:tracebox}")
  private String service;

  @Value("${app.version:dev}")
  private String version;

  @Value("${app.profile:local}")
  private String profile;

  @GetMapping(value = "/api/v1/version", produces = MediaType.APPLICATION_JSON_VALUE)
  Map<String, String> version() {
    Map<String, String> out = new LinkedHashMap<>();
    out.put("service", service);
    out.put("version", version);
    out.put("profile", profile);
    return out;
  }
}