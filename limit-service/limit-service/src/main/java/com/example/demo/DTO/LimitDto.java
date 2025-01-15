package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("limits-service")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimitDto {
    Integer minimum;
    Integer maximum;
}
