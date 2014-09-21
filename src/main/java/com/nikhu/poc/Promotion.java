package com.nikhu.poc;

import java.io.Serializable;
import java.util.Date;

public class Promotion implements Serializable {

	private static final long serialVersionUID = 7288123518556378583L;

	private String mid;
	private String promoCode;
	private boolean isFixedAmount;
	private boolean isPercentageAmount;
	private float fixedAmount;
	private float percentageAmount;
	private Date startDate;
	private Date endDate;
	private int maximumTotalUses;
	private int currentUsedCount;

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public boolean isFixedAmount() {
		return isFixedAmount;
	}

	public void setFixedAmount(boolean isFixedAmount) {
		this.isFixedAmount = isFixedAmount;
	}

	public boolean isPercentageAmount() {
		return isPercentageAmount;
	}

	public void setPercentageAmount(boolean isPercentageAmount) {
		this.isPercentageAmount = isPercentageAmount;
	}

	public float getFixedAmount() {
		return fixedAmount;
	}

	public void setFixedAmount(float fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public float getPercentageAmount() {
		return percentageAmount;
	}

	public void setPercentageAmount(float percentageAmount) {
		this.percentageAmount = percentageAmount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getMaximumTotalUses() {
		return maximumTotalUses;
	}

	public void setMaximumTotalUses(int maximumTotalUses) {
		this.maximumTotalUses = maximumTotalUses;
	}

	public int getCurrentUsedCount() {
		return currentUsedCount;
	}

	public void setCurrentUsedCount(int currentUsedCount) {
		this.currentUsedCount = currentUsedCount;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}
}
