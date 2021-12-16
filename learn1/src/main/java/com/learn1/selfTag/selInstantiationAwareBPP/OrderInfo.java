package com.learn1.selfTag.selInstantiationAwareBPP;

/**
 * <br>
 *
 * @ClassName OrderInfo
 * @Author dwj
 * @Date 2021/12/8 11:06
 * @Version 1.0
 */
public class OrderInfo {
	private String orderNo;
	private Integer orderAmout;
	private String orderdesc;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getOrderAmout() {
		return orderAmout;
	}

	public void setOrderAmout(Integer orderAmout) {
		this.orderAmout = orderAmout;
	}

	public String getOrderdesc() {
		return orderdesc;
	}

	public void setOrderdesc(String orderdesc) {
		this.orderdesc = orderdesc;
	}
}
