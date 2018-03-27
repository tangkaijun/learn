package com.github.kjtang.filterconvert.test;

import com.github.kjtang.filterconvert.xdocreport.DocToPdf;
import org.junit.Test;

/**
 * Created by kjtang on 2018/3/27 0027.
 */
public class XDocReportConvert {

    @Test
    public void testDocToPdf() throws Exception {

        DocToPdf.convertPdf("d:\\report-template.docx","d:\\test.pdf");

    }

}