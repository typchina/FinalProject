package com.posbravo.model;

// Generated Jun 10, 2014 6:20:56 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * PaymentPreAuthCapture generated by hbm2java
 */
public class PaymentPreAuthCapture implements java.io.Serializable {

	private Integer paymentPreAuthCaptureId;
	private Integer dsixreturnCode;
	private String cmdStatus;
	private String textResponse;
	private String authCode;
	private Integer refNo;
	private BigDecimal purchaseAmount;
	private BigDecimal authorizeAmount;
	private BigDecimal gratuity;
	private String acqRefData;
	private String recordNo;
	private String processData;
	private Set payments = new HashSet(0);

	public PaymentPreAuthCapture() {
	}

	public PaymentPreAuthCapture(BigDecimal purchaseAmount,
			BigDecimal authorizeAmount) {
		this.purchaseAmount = purchaseAmount;
		this.authorizeAmount = authorizeAmount;
	}

	public PaymentPreAuthCapture(Integer dsixreturnCode, String cmdStatus,
			String textResponse, String authCode, Integer refNo,
			BigDecimal purchaseAmount, BigDecimal authorizeAmount,
			BigDecimal gratuity, String acqRefData, String recordNo,
			String processData, Set payments) {
		this.dsixreturnCode = dsixreturnCode;
		this.cmdStatus = cmdStatus;
		this.textResponse = textResponse;
		this.authCode = authCode;
		this.refNo = refNo;
		this.purchaseAmount = purchaseAmount;
		this.authorizeAmount = authorizeAmount;
		this.gratuity = gratuity;
		this.acqRefData = acqRefData;
		this.recordNo = recordNo;
		this.processData = processData;
		this.payments = payments;
	}

	public Integer getPaymentPreAuthCaptureId() {
		return this.paymentPreAuthCaptureId;
	}

	public void setPaymentPreAuthCaptureId(Integer paymentPreAuthCaptureId) {
		this.paymentPreAuthCaptureId = paymentPreAuthCaptureId;
	}

	public Integer getDsixreturnCode() {
		return this.dsixreturnCode;
	}

	public void setDsixreturnCode(Integer dsixreturnCode) {
		this.dsixreturnCode = dsixreturnCode;
	}

	public String getCmdStatus() {
		return this.cmdStatus;
	}

	public void setCmdStatus(String cmdStatus) {
		this.cmdStatus = cmdStatus;
	}

	public String getTextResponse() {
		return this.textResponse;
	}

	public void setTextResponse(String textResponse) {
		this.textResponse = textResponse;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public Integer getRefNo() {
		return this.refNo;
	}

	public void setRefNo(Integer refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(BigDecimal purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public BigDecimal getAuthorizeAmount() {
		return this.authorizeAmount;
	}

	public void setAuthorizeAmount(BigDecimal authorizeAmount) {
		this.authorizeAmount = authorizeAmount;
	}

	public BigDecimal getGratuity() {
		return this.gratuity;
	}

	public void setGratuity(BigDecimal gratuity) {
		this.gratuity = gratuity;
	}

	public String getAcqRefData() {
		return this.acqRefData;
	}

	public void setAcqRefData(String acqRefData) {
		this.acqRefData = acqRefData;
	}

	public String getRecordNo() {
		return this.recordNo;
	}

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}

	public String getProcessData() {
		return this.processData;
	}

	public void setProcessData(String processData) {
		this.processData = processData;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

}
