package com.practice.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * @author cuilongcan
 * @create 2020-05-27
 */
@Slf4j
public class PDFTransWord {
    public static final String PDF = ".pdf";
    public static final String DOC = ".doc";

    public static void main(String[] args) {
        Writer writer = null;
        PDDocument doc = null;
        try {
            String pdfFile = "fileName" + PDF;
            doc = PDDocument.load(new File(pdfFile));
            int pagenumber = doc.getNumberOfPages();
            pdfFile = pdfFile.substring(0, pdfFile.lastIndexOf("."));
            String fileName = pdfFile + DOC;
            File file = new File(fileName);
            if (!file.exists()) {
                boolean newFile = file.createNewFile();
                log.info("create newFile {}", newFile);
            }
            FileOutputStream fos = new FileOutputStream(fileName);
            writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            PDFTextStripper stripper = new PDFTextStripper();
            // 排序
            stripper.setSortByPosition(true);
            // 设置转换的开始页
            stripper.setStartPage(1);
            // 设置转换的结束页
            stripper.setEndPage(pagenumber);
            stripper.writeText(doc, writer);
            log.info("pdf转换word成功！");
        } catch (IOException e) {
            log.error("转换异常", e);
        } finally {
            try {
                if (Objects.nonNull(writer)) {
                    writer.close();
                }
                if (Objects.nonNull(doc)) {
                    doc.close();
                }
            } catch (IOException e) {
                log.error("转换流 关闭异常", e);
            }
        }
    }
}
