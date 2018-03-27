package com.github.kjtang.fileconvert.xdocreport;

import com.lowagie.text.FontFactoryImp;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
public class ExtFontFactoryImp extends FontFactoryImp {

    public ExtFontFactoryImp(){
        super();

    }

    public int registerDirectories(){
        int i = 0;
        i += registerDirectory("c:/windows/Fonts");
        i += registerDirectory("c:/winnt/fonts");
        i += registerDirectory("d:/windows/fonts");
        i += registerDirectory("d:/winnt/fonts");
        i += registerDirectory("/usr/share/X11/fonts", true);
        i += registerDirectory("/usr/X/lib/X11/fonts", true);
        i += registerDirectory("/usr/openwin/lib/X11/fonts", true);
        i += registerDirectory("/usr/share/fonts", true);
        i += registerDirectory("/usr/X11R6/lib/X11/fonts", true);
        i += registerDirectory("/Library/Fonts");
        i += registerDirectory("/System/Library/Fonts");
        i += registerDirectory(System.getenv("LICENSE_HOME"), true);

        return i;
    }
}
