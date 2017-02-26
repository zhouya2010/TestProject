package com.sidu.domain;

import java.util.Date;

public class Station {
    private Long id;

    private String stationId;

    private String operatorId;

    private String equipmentOwnerId;

    private String stationName;

    private String countryCode;

    private String areaCode;

    private String address;

    private String stationTel;

    private String serviceTel;

    private Byte stationType;

    private Byte stationStatus;

    private Short parkNums;

    private Double stationLng;

    private Double stationLat;

    private String siteGuide;

    private Byte construction;

    private String matchCarsDesc;

    private String parkInfo;

    private String busineHours;

    private String electricityFeeDesc;

    private String serviceFeeDesc;

    private String parkFeeDesc;

    private String paymentType;

    private Boolean supportOrder;

    private String remark;

    private Date createAt;

    private Date updateAt;

    private Boolean delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getEquipmentOwnerId() {
        return equipmentOwnerId;
    }

    public void setEquipmentOwnerId(String equipmentOwnerId) {
        this.equipmentOwnerId = equipmentOwnerId == null ? null : equipmentOwnerId.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStationTel() {
        return stationTel;
    }

    public void setStationTel(String stationTel) {
        this.stationTel = stationTel == null ? null : stationTel.trim();
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel == null ? null : serviceTel.trim();
    }

    public Byte getStationType() {
        return stationType;
    }

    public void setStationType(Byte stationType) {
        this.stationType = stationType;
    }

    public Byte getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(Byte stationStatus) {
        this.stationStatus = stationStatus;
    }

    public Short getParkNums() {
        return parkNums;
    }

    public void setParkNums(Short parkNums) {
        this.parkNums = parkNums;
    }

    public Double getStationLng() {
        return stationLng;
    }

    public void setStationLng(Double stationLng) {
        this.stationLng = stationLng;
    }

    public Double getStationLat() {
        return stationLat;
    }

    public void setStationLat(Double stationLat) {
        this.stationLat = stationLat;
    }

    public String getSiteGuide() {
        return siteGuide;
    }

    public void setSiteGuide(String siteGuide) {
        this.siteGuide = siteGuide == null ? null : siteGuide.trim();
    }

    public Byte getConstruction() {
        return construction;
    }

    public void setConstruction(Byte construction) {
        this.construction = construction;
    }

    public String getMatchCarsDesc() {
        return matchCarsDesc;
    }

    public void setMatchCarsDesc(String matchCarsDesc) {
        this.matchCarsDesc = matchCarsDesc == null ? null : matchCarsDesc.trim();
    }

    public String getParkInfo() {
        return parkInfo;
    }

    public void setParkInfo(String parkInfo) {
        this.parkInfo = parkInfo == null ? null : parkInfo.trim();
    }

    public String getBusineHours() {
        return busineHours;
    }

    public void setBusineHours(String busineHours) {
        this.busineHours = busineHours == null ? null : busineHours.trim();
    }

    public String getElectricityFeeDesc() {
        return electricityFeeDesc;
    }

    public void setElectricityFeeDesc(String electricityFeeDesc) {
        this.electricityFeeDesc = electricityFeeDesc == null ? null : electricityFeeDesc.trim();
    }

    public String getServiceFeeDesc() {
        return serviceFeeDesc;
    }

    public void setServiceFeeDesc(String serviceFeeDesc) {
        this.serviceFeeDesc = serviceFeeDesc == null ? null : serviceFeeDesc.trim();
    }

    public String getParkFeeDesc() {
        return parkFeeDesc;
    }

    public void setParkFeeDesc(String parkFeeDesc) {
        this.parkFeeDesc = parkFeeDesc == null ? null : parkFeeDesc.trim();
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public Boolean getSupportOrder() {
        return supportOrder;
    }

    public void setSupportOrder(Boolean supportOrder) {
        this.supportOrder = supportOrder;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}