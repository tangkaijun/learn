package com.github.kjtang.filterconvert.xdocreport;

import com.lowagie.text.FontFactory;
import com.lowagie.text.FontFactoryImp;
import fr.opensagres.xdocreport.itext.extension.font.AbstractFontRegistry;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
public abstract class ExtAbstractFontRegistry extends AbstractFontRegistry {

    public static FontFactoryImp extFontFactoryImp = new ExtFontFactoryImp();

    public ExtAbstractFontRegistry() {
        FontFactory.setFontImp(extFontFactoryImp);
    }

}
