package io.docbot.classfile.reader.cp_Info;

import java.util.HashMap;
import java.util.Map;

public class Cp_InfoTags {
    public static short CONSTANT_Class = 7;
    public static short CONSTANT_Fieldref	= 9;
    public static short CONSTANT_Methodref = 10;
    public static short CONSTANT_InterfaceMethodref = 11;
    public static short CONSTANT_String = 8;
    public static short CONSTANT_Integer = 3;
    public static short CONSTANT_Float = 4;
    public static short CONSTANT_Long	= 5;
    public static short CONSTANT_Double = 6;
    public static short CONSTANT_NameAndType = 12;
    public static short CONSTANT_Utf8	 = 1;
    public static short CONSTANT_MethodHandle	= 15;
    public static short CONSTANT_MethodType = 16;
    public static short CONSTANT_Dynamic = 17;
    public static short CONSTANT_InvokeDynamic = 18;
    public static short CONSTANT_Module = 19;
    public static short CONSTANT_Package = 20;
    public static Map<Short, Class<? extends Cp_Info>> cp_InfoTags = new HashMap<>(17);
    static {
        cp_InfoTags.put(CONSTANT_Class,io.docbot.classfile.reader.cp_Info.CONSTANT_Class.class);
        cp_InfoTags.put(CONSTANT_Fieldref,io.docbot.classfile.reader.cp_Info.CONSTANT_Fieldref.class);
        cp_InfoTags.put(CONSTANT_Methodref,io.docbot.classfile.reader.cp_Info.CONSTANT_Methodref.class);
        cp_InfoTags.put(CONSTANT_InterfaceMethodref,io.docbot.classfile.reader.cp_Info.CONSTANT_InterfaceMethodref.class);
        cp_InfoTags.put(CONSTANT_String,io.docbot.classfile.reader.cp_Info.CONSTANT_String.class);
        cp_InfoTags.put(CONSTANT_Integer,io.docbot.classfile.reader.cp_Info.CONSTANT_Integer.class);
        cp_InfoTags.put(CONSTANT_Float,io.docbot.classfile.reader.cp_Info.CONSTANT_Float.class);
        cp_InfoTags.put(CONSTANT_Long,io.docbot.classfile.reader.cp_Info.CONSTANT_Long.class);
        cp_InfoTags.put(CONSTANT_Double,io.docbot.classfile.reader.cp_Info.CONSTANT_Double.class);
        cp_InfoTags.put(CONSTANT_NameAndType,io.docbot.classfile.reader.cp_Info.CONSTANT_NameAndType.class);
        cp_InfoTags.put(CONSTANT_Utf8,io.docbot.classfile.reader.cp_Info.CONSTANT_Utf8.class);
        cp_InfoTags.put(CONSTANT_MethodHandle,io.docbot.classfile.reader.cp_Info.CONSTANT_MethodHandle.class);
        cp_InfoTags.put(CONSTANT_MethodType,io.docbot.classfile.reader.cp_Info.CONSTANT_MethodType.class);
        cp_InfoTags.put(CONSTANT_Dynamic,io.docbot.classfile.reader.cp_Info.CONSTANT_Dynamic.class);
        cp_InfoTags.put(CONSTANT_InvokeDynamic,io.docbot.classfile.reader.cp_Info.CONSTANT_InvokeDynamic.class);
        cp_InfoTags.put(CONSTANT_Module,io.docbot.classfile.reader.cp_Info.CONSTANT_Module.class);
        cp_InfoTags.put(CONSTANT_Package,io.docbot.classfile.reader.cp_Info.CONSTANT_Package.class);
    }
}
