package _2019_8_20.Asm;

import java.io.File;
import java.io.IOException;

/**
 * ��������:�½�Test.class,�÷���ķ�ʽ��ȡһ����
 */
public class ClassMake
{
    public static void main(String[] args) throws IOException
    {
        String systemRootUrl = (new File("")).toURI().toURL().getPath();
        System.out.println(systemRootUrl);
        File file = new File(systemRootUrl + "_2019_8_20/ASM/Test1.class");
        file.createNewFile();

    }

}
