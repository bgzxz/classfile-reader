package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Float extends Cp_Info {
    private float bytes;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        bytes = dataInput.readFloat();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Float";
    }

    @Override
    public String toString(){
        return "CONSTANT_Float:" + bytes;
    }
}
