/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author KoerHunt
 */

public class Encriptador {
    /*
 * Código fácil para cifrar y descifrar en Java ("encriptar" y "desencriptar").
 * No ha sido auditado, ni garantizo su seguridad.
 */

public byte[] cifra(String sinCifrar) throws Exception {
	final byte[] bytes = sinCifrar.getBytes("UTF-8");
	final Cipher aes = obtieneCipher(true);
	final byte[] cifrado = aes.doFinal(bytes);
	return cifrado;
}

public String descifra(byte[] cifrado) throws Exception {
	final Cipher aes = obtieneCipher(false);
	final byte[] bytes = aes.doFinal(cifrado);
	final String sinCifrar = new String(bytes, "UTF-8");
	return sinCifrar;
}

private Cipher obtieneCipher(boolean paraCifrar) throws Exception {
	//Frase de cifrado
        final String frase = "4b1c52d8ccbfab1012813939db97c6f3f047570fadbdfe2b45761ed585fa3a6";
        //Digest
	final MessageDigest digest = MessageDigest.getInstance("SHA");
	digest.update(frase.getBytes("UTF-8"));
        //Generate Key
	final SecretKeySpec key = new SecretKeySpec(digest.digest(), 0, 16, "AES");

	final Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
	if (paraCifrar) {
            //Encripta
		aes.init(Cipher.ENCRYPT_MODE, key);
	} else {
            //desencripta
		aes.init(Cipher.DECRYPT_MODE, key);
	}
        //retorna resultado
	return aes;
}
}
