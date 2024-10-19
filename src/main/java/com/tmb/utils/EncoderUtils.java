package com.tmb.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class EncoderUtils {
    private EncoderUtils()
    {

    }
    public static String getDecodedString(String encodedString)
    {
        return new String(Base64.getDecoder().decode(encodedString.getBytes(StandardCharsets.UTF_8)));
    }
}
