package org.leantech.common.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WalletDto {
  @JsonProperty("created_at")
  private LocalDateTime createdAt;
  @JsonProperty("modified_at")
  private LocalDateTime modifiedAt;
  private String name;
  @JsonProperty("wallet_type")
  private WalletTypeDto walletType;
  @JsonProperty("profile_uid")
  private UUID profileUid;
  private WalletStatus status;
  private BigDecimal balance;
  @JsonProperty("archived_at")
  private LocalDateTime archivedAt;
  @JsonProperty("wallet_uid")
  private UUID walletUid;
}
