package cn.wan.util.fileEnc;

import java.io.*;

/**
 * 简单的文本转换
 * Created by Ww on 2017/12/10.
 */
public class Main {
    private static final int numOfEncAndDec = 0;
    private static int dataOfFile = 0;

    public static void main(String[] args) {
        File srcFile = new File("");
        File encFile = new File("");
        File decFile = new File("");

        try {
//            EncFile(srcFile,encFile);
            DecFile(encFile,decFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void EncFile(File srcFile, File encFile) throws IOException {
        if (!srcFile.exists()) {
            System.out.println("source file not exit");
            return;
        }

        if (!encFile.exists()) {
            encFile.createNewFile();
            System.out.println("encFile created");
        }

        InputStream inputStream = new FileInputStream(srcFile);
        OutputStream outputStream = new FileOutputStream(encFile);

        while ((dataOfFile = inputStream.read()) > -1) {
            outputStream.write(dataOfFile^numOfEncAndDec);
        }

        end(inputStream,outputStream);
    }

    private static void DecFile(File encFile, File decFile) throws IOException {
        if (!encFile.exists()) {
            System.out.println("encrypt file not exists");
            return;
        }

        if (!decFile.exists()) {
            decFile.createNewFile();
            System.out.println("decFile created");
        }

        InputStream inputStream = new FileInputStream(encFile);
        OutputStream outputStream = new FileOutputStream(decFile);

        while ((dataOfFile = inputStream.read()) > -1) {
            outputStream.write(dataOfFile^numOfEncAndDec);
        }

        end(inputStream,outputStream);
    }

    private static void end(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.close();
        outputStream.flush();
        outputStream.close();
    }

}
