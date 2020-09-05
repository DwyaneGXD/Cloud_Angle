package com.dwyane.angle.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@Data
public class ConfigInfoProperties {
  @Value("${cn.springcloud.book.config}")
  private String config;
}
