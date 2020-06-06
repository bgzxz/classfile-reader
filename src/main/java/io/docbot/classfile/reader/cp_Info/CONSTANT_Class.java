package io.docbot.classfile.reader.cp_Info;


import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Class extends Cp_Info {
    private int name_index;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        name_index = dataInput.readUnsignedShort();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Class";
    }
    @Override
    public String toString(){
        return "CONSTANT_Class:#" + name_index;
    }
}
