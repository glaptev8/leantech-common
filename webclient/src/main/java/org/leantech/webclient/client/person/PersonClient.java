package org.leantech.webclient.client.person;

import org.leantech.person.dto.ProfileDto;
import org.leantech.person.dto.UserDto;
import org.leantech.person.dto.UserSaveDto;
import org.leantech.person.dto.VerificationStatusDto;
import org.leantech.webclient.client.Client;

import reactor.core.publisher.Mono;

public interface PersonClient extends Client {
  Mono<UserDto> save(UserSaveDto userSaveDto);

  Mono<UserDto> userInfo(String email);

  Mono<VerificationStatusDto> verify(VerificationStatusDto verificationStatusDto);

  Mono<ProfileDto> getProfile(String profileUid);
}
