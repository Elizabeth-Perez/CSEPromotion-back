package com.isc.cse.promotion.models.classes;

import com.isc.cse.promotion.projections.EmailProjection;

public class ForgottenPasswordResponse implements EmailProjection{

	private boolean send;
	private String codeGenerated;
	
	public ForgottenPasswordResponse(boolean send, String codeGenerated) {
        this.send = send;
        this.codeGenerated = codeGenerated;
    }
	
	@Override
	public boolean isSend() {
		return send;
	}

	@Override
	public String getCodeGenerated() {
		return codeGenerated;
	}

}
