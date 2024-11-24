package com.smuraha.notificationservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class NotificationDto {

    private String status;
    private UUID notificationId;

}
