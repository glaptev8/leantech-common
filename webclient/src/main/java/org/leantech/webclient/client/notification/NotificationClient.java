package org.leantech.webclient.client.notification;

import org.leantech.notification.NotificationDto;
import org.leantech.webclient.client.Client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NotificationClient extends Client {
  Flux<NotificationDto> getUsersNotifications(String userId);

  Mono<NotificationDto> update(NotificationDto notification);
}
