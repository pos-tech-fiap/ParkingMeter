package com.fiap.postech.parkingmeter.dtos;

import com.fiap.postech.parkingmeter.models.Parking;
import com.fiap.postech.parkingmeter.models.enums.ParkingType;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class ParkingDTO {

    private Long id;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Double value;
    private ParkingType parkingType;

    @NotNull
    private Long vehicleId;

    public ParkingDTO() {
    }

    public ParkingDTO(Long id, LocalDateTime entryTime, LocalDateTime exitTime, Double value, ParkingType parkingType, Long vehicleId) {
        this.id = id;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.value = value;
        this.parkingType = parkingType;
        this.vehicleId = vehicleId;
    }

    public ParkingDTO(Parking parking) {
        this.id = parking.getId();
        this.entryTime = parking.getEntryTime();
        this.exitTime = parking.getExitTime();
        this.value = parking.getValue();
        this.parkingType = parking.getParkingType();
        this.vehicleId = parking.getVehicle().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
