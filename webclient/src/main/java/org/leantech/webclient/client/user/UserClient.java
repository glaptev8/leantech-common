package org.leantech.webclient.client.user;

import java.util.UUID;

import org.leantech.common.dto.WalletDto;
import org.leantech.webclient.client.Client;

import reactor.core.publisher.Mono;

public interface UserClient extends Client {

  Mono<WalletDto> getWalletByUid(String uuid);

}
