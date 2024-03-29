package org.leantech.notification;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public  class NotificationDto {

  private  Long id;
  private  LocalDateTime createdAt;
  private  LocalDateTime modifiedAt;
  private  LocalDateTime expirationDate;
  private  String message;
  private  String error;
  private  String userUid;
  private  NotificationStatus notificationStatus;
  private  String messageType;
  private  TriggerCodeEnum triggerCode;
  private  ObjectTypeEnum objectType;
  private  String objectId;
  private  String subject;
  private  String createdBy;
  private  Boolean hasConfirmOtp;
  private  Boolean suggestToAddToTrusted;
}