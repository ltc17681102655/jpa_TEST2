package Algorithmic;

import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    /**
     *  AES加密
     */
    public void demo1() {

        String secretKeyBase = "it-shanghai";

        byte[] ltcs = EncryptUtil.encryptAES("ltc", secretKeyBase);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ltcs.length; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

        String s = EncryptUtil.decryptAES(ltcs, secretKeyBase);
        System.out.println(s);
    }


    @Test
    /**
     *  md5/sha1
     */
    public void demo2() {
        String ltc = EncryptUtil.MD5("ltc");
        String ltc1 = EncryptUtil.SHA1("ltc");
//        90d9d5d7e72b9f5f385555845ecb8a25
        System.out.println(ltc);
//        dd706b010530abd36f323599b80212c468abb639
        System.out.println(ltc1);
    }

}
