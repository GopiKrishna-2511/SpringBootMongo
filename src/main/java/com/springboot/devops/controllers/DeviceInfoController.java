package com.springboot.devops.controllers;

import com.springboot.devops.entity.DeviceInfo;
import com.springboot.devops.service.DeviceInfoService;
import com.springboot.devops.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Utility.base_url)
public class DeviceInfoController {

    @Autowired
    private DeviceInfoService deviceInfoService;

    @GetMapping("/device/getAllDeviceInfo")
    public ResponseEntity<List<DeviceInfo>> getAllDeviceInfo() {
        List<DeviceInfo> deviceEvents = deviceInfoService.getAllDevice();
        if (deviceEvents.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);  // No content found
        }
        return new ResponseEntity<>(deviceEvents, HttpStatus.OK);  // Return the list with OK status
    }


    // Get device events by recordType
    @GetMapping("/device")
    public ResponseEntity<List<DeviceInfo>> getDeviceInfoByRecordType(@RequestParam("recordType") String recordType) {
        List<DeviceInfo> deviceEvents = deviceInfoService.getDeviceInfoByRecordType(recordType);
        if (deviceEvents.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);  // RecordType not found
        }
        return new ResponseEntity<>(deviceEvents, HttpStatus.OK);  // Return the list with OK status
    }

    // Get a specific device event by ID
    @GetMapping("/deviceId/{id}")
    public ResponseEntity<DeviceInfo> getDeviceInfoById(@PathVariable String id) {
        Optional<DeviceInfo> deviceEvent = deviceInfoService.getDeviceInfoById(id);
        // Return the device event with OK status
        // Return 404 if the event was not found
        return deviceEvent.map(deviceInfo -> new ResponseEntity<>(deviceInfo, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Create a new device event
    @PostMapping("/device/createDeviceInfo")
    public ResponseEntity<DeviceInfo> createDeviceInfo(@RequestBody DeviceInfo deviceInfo) {
        DeviceInfo savedInfo = deviceInfoService.saveDeviceEvent(deviceInfo);
        return new ResponseEntity<>(savedInfo, HttpStatus.CREATED);  // Return 201 (Created) with the saved event
    }

    // Delete a device event by ID
    @DeleteMapping("/device/{id}")
    public ResponseEntity<Void> deleteDeviceInfo(@PathVariable String id) {
        Optional<DeviceInfo> deviceEvent = deviceInfoService.getDeviceInfoById(id);
        if (deviceEvent.isPresent()) {
            deviceInfoService.deleteDeviceInfo(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);  // Return 204 (No Content) if deletion is successful
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);  // Return 404 if the event wasn't found
        }
    }
}