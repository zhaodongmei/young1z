package com.demo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("com.demo")
@PropertySource(value="classpath:my.properties")
public class DemoProperties {
    private String author;
}
