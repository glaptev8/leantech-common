package org.leantech.common.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProviderRequestDto {
  @JsonProperty("payment_method")
  private String paymentMethod;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("currency")
  private Currency currency;

  @JsonProperty("external_transaction_id")
  private Long externalTransactionId;

  @JsonProperty("created_at")
  private LocalDateTime createdAt;

  @JsonProperty("updated_at")
  private LocalDateTime updatedAt;

  @JsonProperty("language")
  private String language;

  @JsonProperty("notification_url")
  private String notificationUrl;

  @JsonProperty("card_data")
  private CardData cardData;

  private Customer customer;

  @JsonProperty("merchant_id")
  private Long merchantId;

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Customer {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String country;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class CardData {
    @JsonProperty("card_number")
    private String cardNumber;
    private String cvv;
    @JsonProperty("exp_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd")
    private LocalDate expDate;
  }
}
