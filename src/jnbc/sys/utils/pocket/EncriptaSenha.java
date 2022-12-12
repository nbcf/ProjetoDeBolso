package br.com.exl.util;
/*
* @author NILDO BUENO CORREIA FILHO 
 * NB- DESENVOLVIMENTO DE SISTEMAS
 * EMAIL: nildojava@gmail.com    
 *        nildin82@hotmail.com
 * CEL: 8115-7490
*/
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class EncriptaSenha {

    public static String encripta(String senha) {
        try {

            MessageDigest digest = MessageDigest.getInstance("MD5");

            digest.update(senha.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(digest.digest());

            } catch (NoSuchAlgorithmException ns) {
                     ns.printStackTrace();
                     return senha;
        }
    }
} 
