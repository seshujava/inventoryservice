package in.cognitivzen.inventoryservice.exceptions;

import java.time.LocalDateTime;

public class ExceptionResponse {
	private String errorCode;
	private String errorMsg;
	private LocalDateTime errorDate;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public LocalDateTime getErrorDate() {
		return errorDate;
	}
	public void setErrorDate(LocalDateTime errorDate) {
		this.errorDate = errorDate;
	}
	

}
