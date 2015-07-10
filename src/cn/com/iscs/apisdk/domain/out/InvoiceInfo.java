package cn.com.iscs.apisdk.domain.out;

/**
 * 
 * @author 徐纯
 *	发票信息
 *  2015-7-10 上午11:19:09
 */
public class InvoiceInfo {
	public String billType;
	public String billTitle;
	public String billAccount;
	public String billContent;
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getBillTitle() {
		return billTitle;
	}
	public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}
	public String getBillAccount() {
		return billAccount;
	}
	public void setBillAccount(String billAccount) {
		this.billAccount = billAccount;
	}
	public String getBillContent() {
		return billContent;
	}
	public void setBillContent(String billContent) {
		this.billContent = billContent;
	}
}
