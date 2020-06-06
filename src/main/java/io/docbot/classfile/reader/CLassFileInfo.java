package io.docbot.classfile.reader;

import io.docbot.classfile.reader.cp_Info.Cp_Info;
import io.docbot.classfile.reader.cp_Info.Cp_InfoTags;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

public class CLassFileInfo {
    private byte[] magic;
    private int minor_version;
    private int major_version;
    private int constant_pool_count;
    private Cp_Info[] constant_pool;
    private int access_flags;
    private int this_class;
    private int super_class;
    private int interfaces_count;
    private int[] interfaces;
    private int fields_count;
    private Field_Info[] fields;
    private int methods_count;
    private Method_Info[]  methods;
    private int attributes_count;
    private Attribute_Info[] attributes;

    public byte[] getMagic() {
        return magic;
    }

    public void setMagic(byte[] magic) {
        this.magic = magic;
    }

    public int getMinor_version() {
        return minor_version;
    }

    public void setMinor_version(int minor_version) {
        this.minor_version = minor_version;
    }

    public int getMajor_version() {
        return major_version;
    }

    public void setMajor_version(int major_version) {
        this.major_version = major_version;
    }

    public int getConstant_pool_count() {
        return constant_pool_count;
    }

    public void setConstant_pool_count(int constant_pool_count) {
        this.constant_pool_count = constant_pool_count;
    }

    public Cp_Info[] getConstant_pool() {
        return constant_pool;
    }

    public void setConstant_pool(Cp_Info[] constant_pool) {
        this.constant_pool = constant_pool;
    }

    public int getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(int access_flags) {
        this.access_flags = access_flags;
    }

    public int getThis_class() {
        return this_class;
    }

    public void setThis_class(int this_class) {
        this.this_class = this_class;
    }

    public int getSuper_class() {
        return super_class;
    }

    public void setSuper_class(int super_class) {
        this.super_class = super_class;
    }

    public int getInterfaces_count() {
        return interfaces_count;
    }

    public void setInterfaces_count(int interfaces_count) {
        this.interfaces_count = interfaces_count;
    }

    public int[] getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(int[] interfaces) {
        this.interfaces = interfaces;
    }

    public int getFields_count() {
        return fields_count;
    }

    public void setFields_count(int fields_count) {
        this.fields_count = fields_count;
    }

    public Field_Info[] getFields() {
        return fields;
    }

    public void setFields(Field_Info[] fields) {
        this.fields = fields;
    }

    public int getMethods_count() {
        return methods_count;
    }

    public void setMethods_count(int methods_count) {
        this.methods_count = methods_count;
    }

    public Method_Info[] getMethods() {
        return methods;
    }

    public void setMethods(Method_Info[] methods) {
        this.methods = methods;
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
    public void readClassInfo(DataInput classFileInput) throws IOException, IllegalAccessException, InstantiationException {
        magic = new byte[4];
        classFileInput.readFully(magic);
        minor_version = classFileInput.readUnsignedShort();
        major_version = classFileInput.readUnsignedShort();
        constant_pool_count = classFileInput.readUnsignedShort();
        constant_pool = new Cp_Info[constant_pool_count];
        for(int i = 1;i < constant_pool_count; i++){
            short tag =  classFileInput.readByte();
            Class<? extends Cp_Info> aClass = Cp_InfoTags.cp_InfoTags.get(tag);
            Cp_Info cp_info = aClass.newInstance();
            cp_info.setTag(tag);
            cp_info.readCp_Info(classFileInput);
            constant_pool[i] = cp_info;
            if ((tag == Cp_InfoTags.CONSTANT_Double) || (tag == Cp_InfoTags.CONSTANT_Long)) {
                i++;
            }
        }
        access_flags = classFileInput.readUnsignedShort();
        this_class = classFileInput.readUnsignedShort();
        super_class = classFileInput.readUnsignedShort();
        interfaces_count = classFileInput.readUnsignedShort();
        interfaces = new int[interfaces_count];
        for(int i = 0; i < interfaces_count ;i++){
            interfaces[i] = classFileInput.readUnsignedShort();
        }
        fields_count = classFileInput.readUnsignedShort();
        fields = new Field_Info[fields_count];
        for(int i=0; i < fields_count; i++){
            Field_Info field_info = new Field_Info();
            field_info.readField_Info(classFileInput);
            fields[i] = field_info;
        }
        methods_count = classFileInput.readUnsignedShort();
        methods = new Method_Info[methods_count];
        for(int i=0; i < methods_count; i++){
            Method_Info method_Info = new Method_Info();
            method_Info.readMethod_Info(classFileInput);
            methods[i] = method_Info;
        }
        attributes_count = classFileInput.readUnsignedShort();
        attributes = new Attribute_Info[attributes_count];
        for(int i=0; i < attributes_count; i++){
            Attribute_Info attribute_info = new Attribute_Info();
            attribute_info.readAttribute_Info(classFileInput);
            attributes[i] = attribute_info;
        }
    }

    @Override
    public String toString() {
        return "CLassFileInfo{" +
                "\nmagic=" + magic +
                ", \nminor_version=" + minor_version +
                ", \nmajor_version=" + major_version +
                ", \nconstant_pool_count=" + constant_pool_count +
                ", \nconstant_pool=\n" + printConstant_pool() +
                ", \naccess_flags=" + access_flags +
                ", \nthis_class=" + this_class +
                ", \nsuper_class=" + super_class +
                ", \ninterfaces_count=" + interfaces_count +
                ", \ninterfaces=" + Arrays.toString(interfaces) +
                ", \nfields_count=" + fields_count +
                ", \nfields=" + Arrays.toString(fields) +
                ", \nmethods_count=" + methods_count +
                ", \nmethods=" + Arrays.toString(methods) +
                ", \nattributes_count=" + attributes_count +
                ", \nattributes=" + Arrays.toString(attributes) +
                "\n}";
    }
    private String printConstant_pool(){
        StringBuilder buf = new StringBuilder();
        for(int i = 1; i < constant_pool_count; i++){
            Cp_Info cp_info = constant_pool[i];
            if(cp_info != null) {
                buf.append("#");
                buf.append(i);
                buf.append(" ");
                buf.append(cp_info);
                buf.append("\n");
            }
        }
        return buf.toString();
    }
}
