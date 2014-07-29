/**
 * Copyright (c) 2012, Charles Kelly; All rights reserved
*/
package com.charleskelly.key.otp;

import java.security.Key;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;

import com.charleskelly.security.randomsource.SecureRandomSource;

/**
 * Objects from this class contain a randomly generated byte[].  This length of this
 * byte[] should be longer than the length of the message to be encrypted.
 * <P>
 * Objects from this class can be store in a one time pad ("keystore").
 * 
 * @author Charlie Kelly
 *
 */
public class OneTimeKey implements Key
{
	private static final long serialVersionUID = 1L;
	@XmlElement
	private int 			keySize;
	@XmlElement
	private byte[] 			keyBytes;
	////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("unused")
	private OneTimeKey()
	{
		// used for JAXB persistence
	}// private OneTimeKey()
		////////////////////////////////////////////////////////////////////////
	public OneTimeKey (int keySize)
	{
		this.keySize = keySize;
		keyBytes = new byte [keySize];
		SecureRandomSource.getSecureRandom().nextBytes(keyBytes);
	}// public OneTimeKey (int keySize)
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String getAlgorithm()
	{
		return "OneTimeKey";
	}// public String getAlgorithm()
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String getFormat()
	{
		return "Randomly generated byte[]";
	}// public String getFormat()
	////////////////////////////////////////////////////////////////////////////
	@Override
	public byte[] getEncoded()
	{
		return this.keyBytes;
	}// public byte[] getEncoded()
	////////////////////////////////////////////////////////////////////////////
	public int getKeySize()
	{
		return keySize;
	}
	
	public byte[] getKeyBytes()
	{
		return keyBytes;
	}	
	////////////////////////////////////////////////////////////////////////////
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(keyBytes);
		result = prime * result + keySize;
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OneTimeKey other = (OneTimeKey) obj;
		if (!Arrays.equals(keyBytes, other.keyBytes))
			return false;
		if (keySize != other.keySize)
			return false;
		return true;
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString()
	{
		return "OneTimeKey [keySize=" + keySize + "]";
	}	
	////////////////////////////////////////////////////////////////////////////
}// public class OneTimeKey implements Key