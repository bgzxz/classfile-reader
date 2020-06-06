package io.docbot.classfile.reader;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

public class Field_Info {
    private int access_flags;
    private int name_index;
    private int descriptor_index;
    private int attributes_count;
    private Attribute_Info[] attributes;
    public void readField_Info(DataInput dataInput) throws IOException {
        access_flags = dataInput.readUnsignedShort();
        name_index = dataInput.readUnsignedShort();
        descriptor_index = dataInput.readUnsignedShort();
        attributes_count = dataInput.readUnsignedShort();
        attributes = new Attribute_Info[attributes_count];
        for(int i=0;i< attributes_count;i++){
            Attribute_Info attribute_info = new Attribute_Info();
            attribute_info.readAttribute_Info(dataInput);
            attributes[i] = attribute_info;
        }
    }
    public int getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(int access_flags) {
        this.access_flags = access_flags;
    }

    public int getName_index() {
        return name_index;
    }

    public void setName_index(int name_index) {
        this.name_index = name_index;
    }

    public int getDescriptor_index() {
        return descriptor_index;
    }

    public void setDescriptor_index(int descriptor_index) {
        this.descriptor_index = descriptor_index;
    }

    public int getAttributes_count() {
        return attributes_count;
    }

    public void setAttributes_count(int attributes_count) {
        this.attributes_count = attributes_count;
    }

    public Attribute_Info[] getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute_Info[] attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Field_Info{" +
                "access_flags=" + access_flags +
                ", name_index=" + name_index +
                ", descriptor_index=" + descriptor_index +
                ", attributes_count=" + attributes_count +
                ", attributes=" + Arrays.toString(attributes) +
                '}';
    }
}
