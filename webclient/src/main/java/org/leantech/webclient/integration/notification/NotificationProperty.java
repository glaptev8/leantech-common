package org.leantech.webclient.integration.notification;

import org.leantech.webclient.integration.Base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class NotificationProperty extends Base {
  private String updateStatus;
  private String usersNotification;
}
