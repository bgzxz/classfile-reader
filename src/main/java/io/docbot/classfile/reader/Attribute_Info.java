package io.docbot.classfile.reader;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

public class Attribute_Info {
    private int attribute_name_index;
    private int attribute_length;
    private byte[] info;
    public void readAttribute_Info(DataInput dataInput) throws IOException {
        attribute_name_index = dataInput.readUnsignedShort();
        attribute_length = dataInput.readInt();
        info = new byte[attribute_length];
        dataInput.readFully(info);
    }
    public int getAttribute_name_index() {
        return attribute_name_index;
    }

    public void setAttribute_name_index(int attribute_name_index) {
        this.attribute_name_index = attribute_name_index;
    }

    public int getAttribute_length() {
        return attribute_length;
    }

    public void setAttribute_length(int attribute_length) {
        this.attribute_length = attribute_length;
    }

    public byte[] getInfo() {
        return info;
    }

    public void setInfo(byte[] info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Attribute_Info{" +
                "attribute_name_index=" + attribute_name_index +
                ", attribute_length=" + attribute_length +
                ", info=" + Arrays.toString(info) +
                '}';
    }
}
