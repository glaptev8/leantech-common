package org.leantech.webclient.client.paymentprovider;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.leantech.common.dto.PayOutResponse;
import org.leantech.common.dto.ProviderRequestDto;
import org.leantech.common.dto.TransactionResponse;
import org.leantech.webclient.client.Sender;
import org.leantech.webclient.config.IntegrationConfig;
import org.leantech.webclient.integration.Header;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PaymentProviderClientImpl implements PaymentProviderClient {

  private final Sender sender;
  private final IntegrationConfig integrationConfig;

  @Override
  public Mono<TransactionResponse> transaction(ProviderRequestDto providerRequestDto) {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add("Authorization", "Basic " + Base64.getEncoder().encodeToString(("test" + ":" + "test").getBytes()));
    return sender.post(formUri(integrationConfig.getPaymentProviderProperty().getBaseUrl(),
                               integrationConfig.getPaymentProviderProperty().getTransaction()),
                       providerRequestDto,
                       Map.of(),
                       httpHeaders,
                       TransactionResponse.class);
  }

  @Override
  public Mono<PayOutResponse> payOut(ProviderRequestDto providerRequestDto) {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add("Authorization", "Basic " + Base64.getEncoder().encodeToString(("test" + ":" + "test").getBytes()));

    return sender.post(formUri(integrationConfig.getPaymentProviderProperty().getBaseUrl(),
                               integrationConfig.getPaymentProviderProperty().getPayOut()),
                       providerRequestDto,
                       Map.of(),
                       httpHeaders,
                       PayOutResponse.class);
  }
}
