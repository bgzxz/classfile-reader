package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Methodref extends Cp_Info {
    private int class_index;
    private int name_and_type_index;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        class_index = dataInput.readUnsignedShort();
        name_and_type_index = dataInput.readUnsignedShort();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Methodref";
    }
    @Override
    public String toString(){
        return "CONSTANT_Methodref:#" + class_index +"," + name_and_type_index;
    }
}
