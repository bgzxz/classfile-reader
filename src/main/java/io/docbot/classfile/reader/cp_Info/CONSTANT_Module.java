package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Module extends Cp_Info {
    private int name_index;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        name_index = dataInput.readUnsignedShort();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Module";
    }
}
