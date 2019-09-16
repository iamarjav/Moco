package com.moco.main.exception;

public class MocoException extends Exception {

	private String msg;

	public MocoException(String msg) {
		super();
		this.msg = msg;
	}

}
