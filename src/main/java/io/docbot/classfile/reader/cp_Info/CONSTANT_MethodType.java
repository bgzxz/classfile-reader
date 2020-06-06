package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_MethodType extends Cp_Info {
    private int descriptor_index;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        descriptor_index = dataInput.readUnsignedShort();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_MethodType";
    }
}
