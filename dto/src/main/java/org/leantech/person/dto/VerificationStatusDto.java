package org.leantech.person.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificationStatusDto {
  private LocalDateTime createdAt;
  private ProfileType profileType;
  private UUID targetProfileUid;
  private String applicantId;
  private String details;
  private VerificationStatusStatus verificationStatus;
  private LocalDateTime modifiedAt;
}
