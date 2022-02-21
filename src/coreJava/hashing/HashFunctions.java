package coreJava.hashing;

import java.security.MessageDigest;
import jakarta.xml.bind.DatatypeConverter;


public class HashFunctions {

    // Available algorithms are : MD2, MD5, SHA-1, SHA-224, SHA-256, SHA-384 and SHA-512
    public static String getHash(byte[] inputBytes, String algorithm){
        String hashValue = "";

        try{
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(inputBytes);
            byte[] digestedBytes = messageDigest.digest();
            hashValue = DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
        }catch(Exception e){
            e.printStackTrace();
        }

        return hashValue;
    }

    public static void main(String[] args) {
        String stringBeforeHashing = "random string";

        String hashedStringMD2 = getHash(stringBeforeHashing.getBytes(), "MD2");
        System.out.println("MD2 hash: " + hashedStringMD2);

        String hashedStringMD5 = getHash(stringBeforeHashing.getBytes(), "MD5");
        System.out.println("MD5 hash: " + hashedStringMD5);

        String hashedStringSHA1 = getHash(stringBeforeHashing.getBytes(), "SHA-1");
        System.out.println("SHA-1 hash: " + hashedStringSHA1);

        String hashedStringSHA224 = getHash(stringBeforeHashing.getBytes(), "SHA-224");
        System.out.println("SHA-224 hash: " + hashedStringSHA224);

        String hashedStringSHA256 = getHash(stringBeforeHashing.getBytes(), "SHA-256");
        System.out.println("SHA-256 hash: " + hashedStringSHA256);

        String hashedStringSHA384 = getHash(stringBeforeHashing.getBytes(), "SHA-384");
        System.out.println("SHA-384 hash: " + hashedStringSHA384);

        String hashedStringSHA512 = getHash(stringBeforeHashing.getBytes(), "SHA-512");
        System.out.println("SHA-512 hash: " + hashedStringSHA512);

    }
}
