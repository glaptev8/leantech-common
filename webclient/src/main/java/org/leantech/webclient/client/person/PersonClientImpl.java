package org.leantech.webclient.client.person;

import java.util.HashMap;
import java.util.Map;

import org.leantech.person.dto.ProfileDto;
import org.leantech.person.dto.UserDto;
import org.leantech.person.dto.UserSaveDto;
import org.leantech.person.dto.VerificationStatusDto;
import org.leantech.webclient.client.Sender;
import org.leantech.webclient.config.IntegrationConfig;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class PersonClientImpl implements PersonClient {

  private final Sender sender;
  private final IntegrationConfig integrationConfig;

  @Override
  public Mono<UserDto> save(UserSaveDto userSaveDto) {
    var headers = new HttpHeaders();

    integrationConfig
      .getPersonProperty()
      .getHeaders()
      .forEach(header -> headers.add(header.getKey(), header.getValue()));

    return sender.post(formUri(integrationConfig.getPersonProperty().getBaseUrl(), integrationConfig.getPersonProperty().getSave()),
                       userSaveDto,
                       new HashMap<>(),
                       headers,
                       UserDto.class);
  }

  @Override
  public Mono<UserDto> userInfo(String email) {
    var headers = new HttpHeaders();

    integrationConfig
      .getPersonProperty()
      .getHeaders()
      .forEach(header -> headers.add(header.getKey(), header.getValue()));

    return sender.post(formUri(integrationConfig.getPersonProperty().getBaseUrl(), integrationConfig.getPersonProperty().getUserInfo()),
                       email,
                       new HashMap<>(),
                       headers,
                       UserDto.class);
  }

  @Override
  public Mono<VerificationStatusDto> verify(VerificationStatusDto verificationStatusDto) {
    var headers = new HttpHeaders();

    integrationConfig
      .getPersonProperty()
      .getHeaders()
      .forEach(header -> headers.add(header.getKey(), header.getValue()));

    return sender.post(formUri(integrationConfig.getPersonProperty().getBaseUrl(), integrationConfig.getPersonProperty().getVerify()),
                       verificationStatusDto,
                       new HashMap<>(),
                       headers,
                       VerificationStatusDto.class);
  }

  @Override
  public Mono<ProfileDto> getProfile(String profileUid) {
    return sender.get(formUri(integrationConfig.getPersonProperty().getBaseUrl(),
                              integrationConfig.getPersonProperty().getProfile(),
                              profileUid),
                      Map.of(),
                      HttpHeaders.EMPTY,
                      ProfileDto.class);
  }
}
