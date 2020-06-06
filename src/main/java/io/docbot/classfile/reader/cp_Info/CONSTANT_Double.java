package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public class CONSTANT_Double extends Cp_Info {
    private double bytes;

    @Override
    public void readCp_Info(DataInput dataInput) throws IOException {
        bytes = dataInput.readDouble();
    }

    @Override
    public String getTypeName() {
        return "CONSTANT_Double";
    }
    @Override
    public String toString(){
        return "CONSTANT_Double:" + bytes;
    }
}
