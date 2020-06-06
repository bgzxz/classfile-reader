package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_MethodHandle extends Cp_Info {
    private byte reference_kind;
    private int reference_index;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        reference_kind = dataInput.readByte();
        reference_index = dataInput.readUnsignedShort();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_MethodHandle";
    }
}
