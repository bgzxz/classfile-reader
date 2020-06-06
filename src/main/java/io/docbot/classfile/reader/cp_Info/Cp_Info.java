package io.docbot.classfile.reader.cp_Info;

import java.io.DataInput;
import java.io.IOException;

public abstract class Cp_Info {
    private short tag;

    public int getTag() {
        return tag;
    }

    public void setTag(short tag) {
        this.tag = tag;
    }
    public abstract void readCp_Info(DataInput dataInput) throws IOException;

    public abstract String getTypeName();

}
