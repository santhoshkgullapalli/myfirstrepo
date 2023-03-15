package com.ngc.salesforceplaywright.playwrightngc.utils;

import java.net.URI;
import java.net.URISyntaxException;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UrlModifier {
    
    public static String removePathFromUrl(String url) throws URISyntaxException {
        URI uri = new URI(url);
        return uri.resolve("/").toString();
    }
}
