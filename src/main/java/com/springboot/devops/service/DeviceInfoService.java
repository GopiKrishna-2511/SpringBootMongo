package com.springboot.devops.service;
import com.springboot.devops.entity.DeviceInfo;
import com.springboot.devops.repository.DeviceInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceInfoService {

    @Autowired
    private DeviceInfoRepository deviceInfoRepository;

    // Get all device events
    public List<DeviceInfo> getAllDevice() {
        return deviceInfoRepository.findAll();
    }

    // Get device events by deviceId
    public List<DeviceInfo> getDeviceInfoByDeviceId(String deviceId) {
        return deviceInfoRepository.findByDeviceId(deviceId);
    }

    // Get device events by recordType
    public List<DeviceInfo> getDeviceInfoByRecordType(String recordType) {
        return deviceInfoRepository.findByRecordType(recordType);
    }

    // Save a new device event
    public DeviceInfo saveDeviceEvent(DeviceInfo deviceInfo) {
        return deviceInfoRepository.save(deviceInfo);
    }

    // Find a device event by its ID
    public Optional<DeviceInfo> getDeviceInfoById(String id) {
        return deviceInfoRepository.findById(id);
    }

    // Delete a device event by its ID
    public void deleteDeviceInfo(String id) {
        deviceInfoRepository.deleteById(id);
    }


}
