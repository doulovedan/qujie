package com.jizhiwei.common;

public class Result {

	final public static Result SUCCESS = new Result(1, "请求成功");
	final public static Result FAIL = new Result(0, "请求失败");

	private int code;
	private String msgContent;
	private Object context;

	public Result(int code, String msgContent, Object context) {
		super();
		this.code = code;
		this.msgContent = msgContent;
		this.context = context;
	}

	public Result(int code, String msgContent) {
		super();
		this.code = code;
		this.msgContent = msgContent;
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Object getContext() {
		return context;
	}

	public void setContext(Object context) {
		this.context = context;
	}

	public static Result success(Object object) {
		return new Result(1, "请求成功", object);
	}

	public static Result fail(Object object) {
		return new Result(0, "请求失败", object);
	}

}
