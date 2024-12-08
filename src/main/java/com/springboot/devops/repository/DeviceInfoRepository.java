package com.springboot.devops.repository;

import com.springboot.devops.entity.DeviceInfo;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;


public  interface DeviceInfoRepository extends MongoRepository<DeviceInfo, String> {
    List<DeviceInfo> findByDeviceId(String deviceId);
    List<DeviceInfo> findByRecordType(String recordType);
}
