package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Long extends Cp_Info {
    private long bytes;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        bytes = dataInput.readLong();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Long";
    }
    @Override
    public String toString(){
        return "CONSTANT_Long:" + bytes +"L";
    }
}
