package com.isc.cse.promotion.projections;

public class CarrerProjections {
	
	public interface ContactInformation{
        String getPhone();
        String getEmail();
    }

    public interface SocialNetwork {
        String getSnFacebook();
        String getSnInstagram();
        String getSnLinkedin();
    }

}
