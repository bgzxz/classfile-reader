package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Integer extends Cp_Info {
    private int bytes;
    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        bytes = dataInput.readInt();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Integer";
    }
    @Override
    public String toString(){
        return "CONSTANT_Integer:" + bytes;
    }
}
