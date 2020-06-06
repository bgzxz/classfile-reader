package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;

public class CONSTANT_InvokeDynamic extends Cp_Info {
    private int bootstrap_method_attr_index;
    private int name_and_type_index;
    @Override
    public void readCp_Info(DataInput dataInput) {

    }

    @Override
    public String getTypeName() {
        return "CONSTANT_InvokeDynamic";
    }
}
