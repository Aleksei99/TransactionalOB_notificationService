package com.smuraha.notificationservice.controller;

import com.smuraha.notificationservice.dto.CreateNotificationDto;
import com.smuraha.notificationservice.dto.NotificationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping
    NotificationDto createNotification(@RequestBody CreateNotificationDto createNotificationDto) {
        log.info("Getting notification request << {}", createNotificationDto);

        return NotificationDto.builder()
                .status("success")
                .notificationId(UUID.randomUUID())
                .build();
    }

}
