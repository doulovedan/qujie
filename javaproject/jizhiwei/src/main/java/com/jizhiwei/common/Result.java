package com.jizhiwei.common;

public class Result {

	private String msg;
	private int code;
	private String mContent;

	public static Result Success(String msg) {
		Result result = new Result();
		result.setCode(1);
		result.setMsg(msg);
		result.setmContent("");
		return result;
	}

	public static Result Fail(String msg) {
		Result result = new Result();
		result.setCode(0);
		result.setMsg(msg);
		result.setmContent("");
		return result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

}
