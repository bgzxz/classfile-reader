package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_String extends Cp_Info {
    private int string_index;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        string_index = dataInput.readUnsignedShort();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_String";
    }
    @Override
    public String toString(){
        return "CONSTANT_String:#" + string_index;
    }
}
