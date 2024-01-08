package com.isc.cse.promotion.models.classes;

import com.isc.cse.promotion.projections.EmailProjection;

public class ForgottenPasswordResponse implements EmailProjection{

	private boolean send;
	
	public ForgottenPasswordResponse(boolean send) {
        this.send = send;
    }
	
	@Override
	public boolean isSend() {
		return send;
	}
}
