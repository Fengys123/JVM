package _2019_8_20.Asm;

import jdk.internal.org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static jdk.internal.org.objectweb.asm.Opcodes.*;

public class ClassPrinter extends ClassVisitor
{
    public ClassPrinter()
    {
        super(Opcodes.ASM5);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
    {
        name = "123";
        System.out.println("~~~~1" + name + " extend " + superName + " implements " + interfaces);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value)
    {
        System.out.println("~~~~2" + " " + descriptor + " " + name);
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions)
    {
        System.out.println("~~~~3" + " " + name + descriptor);
        return null;
    }

    public static void main(String[] args) throws IOException
    {
        /*
        ClassPrinter classPrinter = new ClassPrinter();

        InputStream cl = ClassLoader.getSystemResourceAsStream(TestAsm.class.getName().replace(".", "/") + ".class");
        ClassReader classReader = new ClassReader(cl);

        classReader.accept(classPrinter, 0);
        */

        ClassWriter cw = new ClassWriter(0);

        //��汾�����ʱ�־�Լ����η�����ȫ�������ͣ����࣬�ӿ�
        cw.visit(V1_7, ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE, "_2019_8_20/Asm/Test", null, "java/lang/Object", new String[]{});

        //���ʱ�־�����֣����ͣ����ͣ�ֵ
        cw.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL,"LESS","I", null,new Integer(-1)).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL,"EQUAL","I", null,new Integer(0)).visitEnd();
        cw.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL,"GRATER","I", null,new Integer(1)).visitEnd();

        //���ʱ�־�����֣�ǩ�������ͣ�throws�쳣
        cw.visitMethod(ACC_PUBLIC+ACC_ABSTRACT,"compareTo","(Ljava/lang/Object;)I",
                null,null).visitEnd();

        //֪ͨclassWriter���ඨ�������
        cw.visitEnd();

        String systemRootUrl = (new File("")).toURI().toURL().getPath();
        File file=new File(systemRootUrl+"_2019_8_20/Asm/Test.class");
        String parent=file.getParent();
        File parent1=new File(parent);
        parent1.mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(cw.toByteArray());
    }

}
