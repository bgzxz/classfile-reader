package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Utf8 extends Cp_Info {
    private int length;
    private byte[] bytes;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        length = dataInput.readUnsignedShort();
        bytes = new byte[length];
        dataInput.readFully(bytes);
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Utf8";
    }
    @Override
    public String toString(){
        return "CONSTANT_Utf8:" + new String(bytes);
    }
}
