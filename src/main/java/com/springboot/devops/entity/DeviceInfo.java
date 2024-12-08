package com.springboot.devops.entity;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "DeviceInfo")
public class DeviceInfo {

        @Id
        private String id;  // The MongoDB document ID
        private String recordType;
        private String deviceId;
        private LocalDateTime eventDateTime;
        private int fieldA;
        private String fieldB;
        private double fieldC;

}
