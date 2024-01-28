package org.leantech.webclient.client.paymentprovider;

import org.leantech.common.dto.PayOutResponse;
import org.leantech.common.dto.ProviderRequestDto;
import org.leantech.common.dto.TransactionResponse;
import org.leantech.webclient.client.Client;

import reactor.core.publisher.Mono;

public interface PaymentProviderClient extends Client {
  Mono<TransactionResponse> transaction(ProviderRequestDto providerRequestDto);

  Mono<PayOutResponse> payOut(ProviderRequestDto providerRequestDto);
}
