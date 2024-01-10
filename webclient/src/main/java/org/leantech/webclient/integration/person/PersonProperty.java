package org.leantech.webclient.integration.person;

import org.leantech.webclient.integration.Base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PersonProperty extends Base {
  private String save;
  private String verify;
}
