package org.leantech.webclient.client.user;

import java.util.Map;

import org.leantech.common.dto.WalletDto;
import org.leantech.webclient.client.Sender;
import org.leantech.webclient.config.IntegrationConfig;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserClientImpl implements UserClient {

  private final Sender sender;
  private final IntegrationConfig integrationConfig;

  @Override
  public Mono<WalletDto> getWalletByUid(String uuid) {
    var url = formUri(integrationConfig.getUserProperty().getBaseUrl(),
                      uuid);

    return sender.get(url,
                      Map.of(),
                      HttpHeaders.EMPTY,
                      WalletDto.class);
  }
}
