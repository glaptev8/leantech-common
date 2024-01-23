package org.leantech.webclient.client.notification;

import java.util.Map;

import org.leantech.notification.NotificationDto;
import org.leantech.webclient.client.Sender;
import org.leantech.webclient.config.IntegrationConfig;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class NotificationClientImpl implements NotificationClient {

  private final Sender sender;
  private final IntegrationConfig integrationConfig;

  @Override
  public Flux<NotificationDto> getUsersNotifications(String userId) {
    return sender.postFlux(formUri(integrationConfig.getNotificationProperty().getBaseUrl(), integrationConfig.getNotificationProperty().getUsersNotification()),
                           null,
                           Map.of("userId", userId),
                           HttpHeaders.EMPTY,
                           NotificationDto.class
                           );
  }

  @Override
  public Mono<NotificationDto> update(NotificationDto notification) {
    return sender.post(formUri(integrationConfig.getNotificationProperty().getBaseUrl(), integrationConfig.getNotificationProperty().getUpdateStatus()),
                           notification,
                           Map.of(),
                           HttpHeaders.EMPTY,
                           NotificationDto.class
    );
  }
}
