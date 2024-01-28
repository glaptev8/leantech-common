package org.leantech.webclient.integration.paymentprovider;

import org.leantech.webclient.integration.Base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PaymentProviderProperty extends Base {
  private String transaction;
  private String payOut;
}
