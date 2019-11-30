package com.brainmentors.ims.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public interface Encrypt {
	
	public static String generatePassword(String pwd) throws NoSuchAlgorithmException {
		byte salt[] = getSalt();
		MessageDigest md = MessageDigest.getInstance("MD5");
        //Add password bytes to digest
        md.update(salt);
        //Get the hash's bytes 
        byte[] bytes = md.digest(pwd.getBytes());
		
		String encryptedPassword = new String(bytes);
		System.out.println(encryptedPassword);
		return encryptedPassword;
	}
	
	private static byte[] getSalt() throws NoSuchAlgorithmException
	{
	    //Always use a SecureRandom generator
	    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
	    //Create array for salt
	    byte[] salt = new byte[16];
	    //Get a random salt
	    sr.nextBytes(salt);
	    //return salt
	    return salt;
	}

}
