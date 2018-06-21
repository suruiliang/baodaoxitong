package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustSettleAccount {
    private Long accountId;

    private Long custId;

    private Integer accountType;

    private String gopenbankId;

    private String gaccountName;

    private String gaccountNo;

    private String accountOpenPermitPath;

    private String sopenbankId;

    private String saccountName;

    private String saccountNo;

    private Integer auditStatus;

    private String remark;

    private Integer delStatus;

    private Integer changeStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    private String bankCardFacePath;

    private String bankCardBackPath;

    private String gopenbank;

    private String sopenbank;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    
    public String getAccountOpenPermitPath() {
        return accountOpenPermitPath;
    }

    public void setAccountOpenPermitPath(String accountOpenPermitPath) {
        this.accountOpenPermitPath = accountOpenPermitPath == null ? null : accountOpenPermitPath.trim();
    }

    


    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Integer getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Integer changeStatus) {
        this.changeStatus = changeStatus;
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

    public Long getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getBankCardFacePath() {
        return bankCardFacePath;
    }

    public void setBankCardFacePath(String bankCardFacePath) {
        this.bankCardFacePath = bankCardFacePath == null ? null : bankCardFacePath.trim();
    }

    public String getBankCardBackPath() {
        return bankCardBackPath;
    }

    public void setBankCardBackPath(String bankCardBackPath) {
        this.bankCardBackPath = bankCardBackPath == null ? null : bankCardBackPath.trim();
    }

	public String getGopenbankId() {
		return gopenbankId;
	}

	public void setGopenbankId(String gopenbankId) {
		this.gopenbankId = gopenbankId;
	}

	public String getGaccountName() {
		return gaccountName;
	}

	public void setGaccountName(String gaccountName) {
		this.gaccountName = gaccountName;
	}

	public String getGaccountNo() {
		return gaccountNo;
	}

	public void setGaccountNo(String gaccountNo) {
		this.gaccountNo = gaccountNo;
	}

	public String getSopenbankId() {
		return sopenbankId;
	}

	public void setSopenbankId(String sopenbankId) {
		this.sopenbankId = sopenbankId;
	}

	public String getSaccountName() {
		return saccountName;
	}

	public void setSaccountName(String saccountName) {
		this.saccountName = saccountName;
	}

	public String getSaccountNo() {
		return saccountNo;
	}

	public void setSaccountNo(String saccountNo) {
		this.saccountNo = saccountNo;
	}

	public String getGopenbank() {
		return gopenbank;
	}

	public void setGopenbank(String gopenbank) {
		this.gopenbank = gopenbank;
	}

	public String getSopenbank() {
		return sopenbank;
	}

	public void setSopenbank(String sopenbank) {
		this.sopenbank = sopenbank;
	}

}