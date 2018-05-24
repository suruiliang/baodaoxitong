package com.bec.cloud.baodanxitong.web.tax.model;

public class TaxGoodItem {
    private Integer id;

    private Integer pieceId;

    private Short classId;

    private Short chapterId;

    private Short sectionId;

    private Short stripId;

    private Short paragraphId;

    private Short termId;

    private Short orderId;

    private Short subheadingId;

    private Short detailId;

    private Long mergeCoding;

    private String goodsName;

    private String explain;

    private String taxRate;

    private String taxSpecialManage;

    private String taxPolicy;

    private String taxSpecialCode;

    private String taxConAdmin;

    private String taxConPolicy;

    private String taxConCode;

    private String keyWord;

    private String sumItem;

    private String statisticsCode;

    private String impExp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPieceId() {
        return pieceId;
    }

    public void setPieceId(Integer pieceId) {
        this.pieceId = pieceId;
    }

    public Short getClassId() {
        return classId;
    }

    public void setClassId(Short classId) {
        this.classId = classId;
    }

    public Short getChapterId() {
        return chapterId;
    }

    public void setChapterId(Short chapterId) {
        this.chapterId = chapterId;
    }

    public Short getSectionId() {
        return sectionId;
    }

    public void setSectionId(Short sectionId) {
        this.sectionId = sectionId;
    }

    public Short getStripId() {
        return stripId;
    }

    public void setStripId(Short stripId) {
        this.stripId = stripId;
    }

    public Short getParagraphId() {
        return paragraphId;
    }

    public void setParagraphId(Short paragraphId) {
        this.paragraphId = paragraphId;
    }

    public Short getTermId() {
        return termId;
    }

    public void setTermId(Short termId) {
        this.termId = termId;
    }

    public Short getOrderId() {
        return orderId;
    }

    public void setOrderId(Short orderId) {
        this.orderId = orderId;
    }

    public Short getSubheadingId() {
        return subheadingId;
    }

    public void setSubheadingId(Short subheadingId) {
        this.subheadingId = subheadingId;
    }

    public Short getDetailId() {
        return detailId;
    }

    public void setDetailId(Short detailId) {
        this.detailId = detailId;
    }

    public Long getMergeCoding() {
        return mergeCoding;
    }

    public void setMergeCoding(Long mergeCoding) {
        this.mergeCoding = mergeCoding;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate == null ? null : taxRate.trim();
    }

    public String getTaxSpecialManage() {
        return taxSpecialManage;
    }

    public void setTaxSpecialManage(String taxSpecialManage) {
        this.taxSpecialManage = taxSpecialManage == null ? null : taxSpecialManage.trim();
    }

    public String getTaxPolicy() {
        return taxPolicy;
    }

    public void setTaxPolicy(String taxPolicy) {
        this.taxPolicy = taxPolicy == null ? null : taxPolicy.trim();
    }

    public String getTaxSpecialCode() {
        return taxSpecialCode;
    }

    public void setTaxSpecialCode(String taxSpecialCode) {
        this.taxSpecialCode = taxSpecialCode == null ? null : taxSpecialCode.trim();
    }

    public String getTaxConAdmin() {
        return taxConAdmin;
    }

    public void setTaxConAdmin(String taxConAdmin) {
        this.taxConAdmin = taxConAdmin == null ? null : taxConAdmin.trim();
    }

    public String getTaxConPolicy() {
        return taxConPolicy;
    }

    public void setTaxConPolicy(String taxConPolicy) {
        this.taxConPolicy = taxConPolicy == null ? null : taxConPolicy.trim();
    }

    public String getTaxConCode() {
        return taxConCode;
    }

    public void setTaxConCode(String taxConCode) {
        this.taxConCode = taxConCode == null ? null : taxConCode.trim();
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    public String getSumItem() {
        return sumItem;
    }

    public void setSumItem(String sumItem) {
        this.sumItem = sumItem == null ? null : sumItem.trim();
    }

    public String getStatisticsCode() {
        return statisticsCode;
    }

    public void setStatisticsCode(String statisticsCode) {
        this.statisticsCode = statisticsCode == null ? null : statisticsCode.trim();
    }

    public String getImpExp() {
        return impExp;
    }

    public void setImpExp(String impExp) {
        this.impExp = impExp == null ? null : impExp.trim();
    }
}