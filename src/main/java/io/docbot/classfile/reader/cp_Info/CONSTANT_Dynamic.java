package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Dynamic extends Cp_Info {
    private int bootstrap_method_attr_index;
    private int name_and_type_index;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        bootstrap_method_attr_index = dataInput.readUnsignedShort();
        name_and_type_index = dataInput.readUnsignedShort();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Dynamic";
    }
}
