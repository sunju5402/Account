package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration // bean 등록
@EnableJpaAuditing // 어플리케이션 시작시, auto scan
public class JpaAuditingConfiguration {
}
