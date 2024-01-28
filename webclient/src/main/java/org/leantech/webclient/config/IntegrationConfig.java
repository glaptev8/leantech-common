package org.leantech.webclient.config;

import org.leantech.webclient.integration.notification.NotificationProperty;
import org.leantech.webclient.integration.paymentprovider.PaymentProviderProperty;
import org.leantech.webclient.integration.person.PersonProperty;
import org.leantech.webclient.integration.user.UserProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "integration")
public class IntegrationConfig {
  private PersonProperty personProperty;
  private NotificationProperty notificationProperty;
  private UserProperty userProperty;
  private PaymentProviderProperty paymentProviderProperty;
}
