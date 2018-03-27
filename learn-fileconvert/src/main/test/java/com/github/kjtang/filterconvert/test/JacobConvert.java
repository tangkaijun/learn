package com.github.kjtang.filterconvert.test;

import com.github.kjtang.fileconvert.jacob.Word2Pdf;
import org.junit.Test;

/**
 * Created by kaijun on 2018/3/27.
 */
public class JacobConvert {

    //http://feifei.im/archives/93
    @Test
    public void testDoc2Pdf(){
        Word2Pdf.word2Pdf("d:\\JM770683530R90250001000.doc","d:\\test.pdf");
    }
}
