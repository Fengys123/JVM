package _2019_8_20.Asm;

import jdk.internal.org.objectweb.asm.ClassReader;

import java.io.IOException;

/**
 * ASM�м�����Ҫ����
 * 1. ClassReader:�����ֽ�������� class �ļ����뵽�ڴ浱�У������������ݽṹ��ʾ�����е�һ���ڵ������ class �ļ��е�ĳ�����򡣿��Խ� ClassReader ������ Visitor ģʽ�еķ����ߵ�ʵ����
 * 2. ClassVisitor:ClassReader ���󴴽�֮�󣬵��� ClassReader#accept() ����������һ�� ClassVisitor ������ ClassReader �б������ṹ�Ĳ�ͬ�ڵ�ʱ����� ClassVisitor �����в�ͬ�� visit()
 * �������Ӷ�ʵ�ֶ��ֽ�����޸ġ��� ClassVisitor �е�һЩ���ʻ�����ӹ��̣����� visitMethod ����� MethodVisitor �ĵ��ã�visitField ������� FieldVisitor �ĵ��ã��û�Ҳ���Զ���Щ Visitor
 * �����Լ���ʵ�֣��Ӷ��ﵽ����Щ�ӽڵ���ֽ���ķ��ʺ��޸ġ�
 * �� ASM �ķ�����ģʽ�У��û��������ṩ���ֲ�ͬ������ ClassVisitor ��ʵ�֣�������������ģʽ�ṩ�� ClassReader ��ʹ�ã��� ClassReader ֻ��Ҫ accept �������е�ͷ�ڵ㴦�� ClassVisitor��
 * 3. ClassWrite:ClassWriter �� ClassVisitor ��ʵ����,���������ֽ���Ĺ�����,��һ�����������е����һ���ڵ�,��֮ǰ��ÿһ��ClassVisit���������ڶ�ԭʼ�ֽ�����޸�,�� ClassWriter �Ĳ���������ʵ�ð�ÿһ����
 * ���޸ĺ���ֽ������Ϊ�ֽ����顣
 *
 * ASM�Ĺ�������
 * 1. ClassReader ��ȡ�ֽ��뵽�ڴ��У��������ڱ�ʾ���ֽ�����ڲ���ʾ������ClassReader ��Ӧ�ڷ�����ģʽ�е�Ԫ��
 * 2. ��װ ClassVisitor ����������һϵ�� ClassVisitor ����˶��ֽ���һϵ�в�ͬ���ֽ����޸Ĺ�������Ӧ�ڷ�����ģʽ�еķ����� Visitor
 * 3. Ȼ����� ClassReader#accept() ���������� ClassVisitor ���󣬴� ClassVisitor ����������ͷ��㣬������������ÿһ�� ClassVisitor �Ķ��Ѽ��ؽ��ڴ���ֽ�������ṹ�ϵ�ÿ���ڵ�ķ��ʺ��޸�
 * 4. �������������ĩ�ˣ����� ClassWriter ��� visitor �����޸ĺ���ֽ�����������
 */
public class Client
{
    public static void main(String[] args) throws IOException
    {
        String className = TestAsm.class.getName();
        //System.out.println(className);
        ClassReader classReader = new ClassReader(className);

    }
}
