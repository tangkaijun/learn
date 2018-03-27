package com.github.kjtang.fileconvert.xdocreport;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
public class ExtITextFontRegistry extends ExtAbstractFontRegistry {


    public static ExtITextFontRegistry getRegistry() {
        return INSTANCE;
    }

    @Override
    protected String resolveFamilyName(String familyName, int style) {
        return familyName;
    }

    private static final ExtITextFontRegistry INSTANCE = new ExtITextFontRegistry();

}
