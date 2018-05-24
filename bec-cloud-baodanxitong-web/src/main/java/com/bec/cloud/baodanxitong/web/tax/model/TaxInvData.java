package com.bec.cloud.baodanxitong.web.tax.model;

import java.math.BigDecimal;
import java.util.Date;

public class TaxInvData {
    private String id;

    private String invOrderId;

    private Long custId;

    private String devType;

    private String invTypeCode;

    private String invTypeSpecial;

    private String payUnit;

    private String payTaxRegNo;

    private String payMobile;

    private String payEmail;

    private String payAddress;

    private String payDeposit;

    private String beneficiary;

    private String invOperate;

    private String auditor;

    private String makeInvType;

    private String invDitailFlag;

    private String returnInvId;

    private String oriInvCode;

    private String oriInvNumber;

    private String collectTaxMode;

    private BigDecimal deductAmount;

    private BigDecimal sumAmount;

    private BigDecimal sumTaxAmount;

    private BigDecimal sumTotal;

    private String backup;

    private BigDecimal compositeTaxRate;

    private String invCode;

    private String invNumber;

    private Date invDate;

    private String fiscalCode;

    private String checkCode;

    private String qrcode;

    private Date invUploadTime;

    private String isMakeInv;

    private String isOverdue;

    private String sendType;

    private String sendFlag;

    private Long userId;

    private String pdfAddress;

    private String orderId;

    private String invStatus;

    private String invFailCause;

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

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType == null ? null : devType.trim();
    }

    public String getInvTypeCode() {
        return invTypeCode;
    }

    public void setInvTypeCode(String invTypeCode) {
        this.invTypeCode = invTypeCode == null ? null : invTypeCode.trim();
    }

    public String getInvTypeSpecial() {
        return invTypeSpecial;
    }

    public void setInvTypeSpecial(String invTypeSpecial) {
        this.invTypeSpecial = invTypeSpecial == null ? null : invTypeSpecial.trim();
    }

    public String getPayUnit() {
        return payUnit;
    }

    public void setPayUnit(String payUnit) {
        this.payUnit = payUnit == null ? null : payUnit.trim();
    }

    public String getPayTaxRegNo() {
        return payTaxRegNo;
    }

    public void setPayTaxRegNo(String payTaxRegNo) {
        this.payTaxRegNo = payTaxRegNo == null ? null : payTaxRegNo.trim();
    }

    public String getPayMobile() {
        return payMobile;
    }

    public void setPayMobile(String payMobile) {
        this.payMobile = payMobile == null ? null : payMobile.trim();
    }

    public String getPayEmail() {
        return payEmail;
    }

    public void setPayEmail(String payEmail) {
        this.payEmail = payEmail == null ? null : payEmail.trim();
    }

    public String getPayAddress() {
        return payAddress;
    }

    public void setPayAddress(String payAddress) {
        this.payAddress = payAddress == null ? null : payAddress.trim();
    }

    public String getPayDeposit() {
        return payDeposit;
    }

    public void setPayDeposit(String payDeposit) {
        this.payDeposit = payDeposit == null ? null : payDeposit.trim();
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary == null ? null : beneficiary.trim();
    }

    public String getInvOperate() {
        return invOperate;
    }

    public void setInvOperate(String invOperate) {
        this.invOperate = invOperate == null ? null : invOperate.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public String getMakeInvType() {
        return makeInvType;
    }

    public void setMakeInvType(String makeInvType) {
        this.makeInvType = makeInvType == null ? null : makeInvType.trim();
    }

    public String getInvDitailFlag() {
        return invDitailFlag;
    }

    public void setInvDitailFlag(String invDitailFlag) {
        this.invDitailFlag = invDitailFlag == null ? null : invDitailFlag.trim();
    }

    public String getReturnInvId() {
        return returnInvId;
    }

    public void setReturnInvId(String returnInvId) {
        this.returnInvId = returnInvId == null ? null : returnInvId.trim();
    }

    public String getOriInvCode() {
        return oriInvCode;
    }

    public void setOriInvCode(String oriInvCode) {
        this.oriInvCode = oriInvCode == null ? null : oriInvCode.trim();
    }

    public String getOriInvNumber() {
        return oriInvNumber;
    }

    public void setOriInvNumber(String oriInvNumber) {
        this.oriInvNumber = oriInvNumber == null ? null : oriInvNumber.trim();
    }

    public String getCollectTaxMode() {
        return collectTaxMode;
    }

    public void setCollectTaxMode(String collectTaxMode) {
        this.collectTaxMode = collectTaxMode == null ? null : collectTaxMode.trim();
    }

    public BigDecimal getDeductAmount() {
        return deductAmount;
    }

    public void setDeductAmount(BigDecimal deductAmount) {
        this.deductAmount = deductAmount;
    }

    public BigDecimal getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(BigDecimal sumAmount) {
        this.sumAmount = sumAmount;
    }

    public BigDecimal getSumTaxAmount() {
        return sumTaxAmount;
    }

    public void setSumTaxAmount(BigDecimal sumTaxAmount) {
        this.sumTaxAmount = sumTaxAmount;
    }

    public BigDecimal getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(BigDecimal sumTotal) {
        this.sumTotal = sumTotal;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup == null ? null : backup.trim();
    }

    public BigDecimal getCompositeTaxRate() {
        return compositeTaxRate;
    }

    public void setCompositeTaxRate(BigDecimal compositeTaxRate) {
        this.compositeTaxRate = compositeTaxRate;
    }

    public String getInvCode() {
        return invCode;
    }

    public void setInvCode(String invCode) {
        this.invCode = invCode == null ? null : invCode.trim();
    }

    public String getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(String invNumber) {
        this.invNumber = invNumber == null ? null : invNumber.trim();
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode == null ? null : fiscalCode.trim();
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public Date getInvUploadTime() {
        return invUploadTime;
    }

    public void setInvUploadTime(Date invUploadTime) {
        this.invUploadTime = invUploadTime;
    }

    public String getIsMakeInv() {
        return isMakeInv;
    }

    public void setIsMakeInv(String isMakeInv) {
        this.isMakeInv = isMakeInv == null ? null : isMakeInv.trim();
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue == null ? null : isOverdue.trim();
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType == null ? null : sendType.trim();
    }

    public String getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag == null ? null : sendFlag.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPdfAddress() {
        return pdfAddress;
    }

    public void setPdfAddress(String pdfAddress) {
        this.pdfAddress = pdfAddress == null ? null : pdfAddress.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getInvStatus() {
        return invStatus;
    }

    public void setInvStatus(String invStatus) {
        this.invStatus = invStatus == null ? null : invStatus.trim();
    }

    public String getInvFailCause() {
        return invFailCause;
    }

    public void setInvFailCause(String invFailCause) {
        this.invFailCause = invFailCause == null ? null : invFailCause.trim();
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