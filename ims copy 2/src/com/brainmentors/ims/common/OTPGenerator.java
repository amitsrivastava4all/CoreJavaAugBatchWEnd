package com.brainmentors.ims.common;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

import javax.crypto.KeyGenerator;

import com.eatthepath.otp.TimeBasedOneTimePasswordGenerator;

public interface OTPGenerator {
	public static int generateOTP() throws NoSuchAlgorithmException, InvalidKeyException {
		final TimeBasedOneTimePasswordGenerator totp = new TimeBasedOneTimePasswordGenerator();
		final Key key;
		{
		    final KeyGenerator keyGenerator = KeyGenerator.getInstance(totp.getAlgorithm());

		    // SHA-1 and SHA-256 prefer 64-byte (512-bit) keys; SHA512 prefers 128-byte (1024-bit) keys
		    keyGenerator.init(512);

		    key = keyGenerator.generateKey();
		   
		    final Instant now = Instant.now();
		    //final Instant later = now.plus(totp.getTimeStep());
		    	
		    		return totp.generateOneTimePassword(key, now);
		    //System.out.format("Future password:  %06d\n", totp.generateOneTimePassword(key, later));
		}
	}
	

}
