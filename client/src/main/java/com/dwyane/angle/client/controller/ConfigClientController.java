package com.dwyane.angle.client.controller;

import com.dwyane.angle.client.config.ConfigInfoProperties;
import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@AllArgsConstructor
public class ConfigClientController {
  private final ConfigInfoProperties configInfoProperties;

  @RequestMapping("/getConfigInfo")
  public String getConfigInfo() {
    return configInfoProperties.getConfig();
  }
}
