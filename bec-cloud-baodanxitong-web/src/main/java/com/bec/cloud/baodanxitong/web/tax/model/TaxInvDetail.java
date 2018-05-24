package com.bec.cloud.baodanxitong.web.tax.model;

import java.math.BigDecimal;
import java.util.Date;

public class TaxInvDetail {
    private String id;

    private String invOrderId;

    private Integer detailLineNum;

    private String lineType;

    private String goodsCode;

    private String goodsName;

    private String goodsTaxType;

    private String goodsType;

    private String goodsUnit;

    private BigDecimal goodsNumber;

    private BigDecimal goodsPrice;

    private BigDecimal goodsAmount;

    private BigDecimal taxAmount;

    private BigDecimal taxRate;

    private Integer lfLineNum;

    private String includeTaxFlag;

    private String addedTaxManage;

    private String preferentialPolicy;

    private String dutyFreeType;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationId;

    private Date operationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInvOrderId() {
        return invOrderId;
    }

    public void setInvOrderId(String invOrderId) {
        this.invOrderId = invOrderId == null ? null : invOrderId.trim();
    }

    public Integer getDetailLineNum() {
        return detailLineNum;
    }

    public void setDetailLineNum(Integer detailLineNum) {
        this.detailLineNum = detailLineNum;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType == null ? null : lineType.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsTaxType() {
        return goodsTaxType;
    }

    public void setGoodsTaxType(String goodsTaxType) {
        this.goodsTaxType = goodsTaxType == null ? null : goodsTaxType.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public BigDecimal getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(BigDecimal goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getLfLineNum() {
        return lfLineNum;
    }

    public void setLfLineNum(Integer lfLineNum) {
        this.lfLineNum = lfLineNum;
    }

    public String getIncludeTaxFlag() {
        return includeTaxFlag;
    }

    public void setIncludeTaxFlag(String includeTaxFlag) {
        this.includeTaxFlag = includeTaxFlag == null ? null : includeTaxFlag.trim();
    }

    public String getAddedTaxManage() {
        return addedTaxManage;
    }

    public void setAddedTaxManage(String addedTaxManage) {
        this.addedTaxManage = addedTaxManage == null ? null : addedTaxManage.trim();
    }

    public String getPreferentialPolicy() {
        return preferentialPolicy;
    }

    public void setPreferentialPolicy(String preferentialPolicy) {
        this.preferentialPolicy = preferentialPolicy == null ? null : preferentialPolicy.trim();
    }

    public String getDutyFreeType() {
        return dutyFreeType;
    }

    public void setDutyFreeType(String dutyFreeType) {
        this.dutyFreeType = dutyFreeType == null ? null : dutyFreeType.trim();
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Long getEntryUserId() {
        return entryUserId;
    }

    public void setEntryUserId(Long entryUserId) {
        this.entryUserId = entryUserId;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}