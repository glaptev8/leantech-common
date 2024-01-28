package org.leantech.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayOutResponse {
  @JsonProperty("pay_out_id")
  private Long payOutId;
  private PayOutStatusType status;
  private String message;
}
