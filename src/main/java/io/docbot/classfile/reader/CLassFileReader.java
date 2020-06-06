package io.docbot.classfile.reader;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CLassFileReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        DataInputStream classFileInput = null;

        try {
            fileInputStream = new FileInputStream(args[0]);
            classFileInput = new DataInputStream(fileInputStream);
            CLassFileInfo cLassFileInfo = new CLassFileInfo();
            cLassFileInfo.readClassInfo(classFileInput);
            System.out.println(cLassFileInfo);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (classFileInput != null) {
                classFileInput.close();
            }
        }

    }
}
