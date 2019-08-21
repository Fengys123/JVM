package _2019_8_20;

/**
 * ��ĳ�ʼ����ʱ������:
 * 1. �����������ʱ����ʼ���û�ָ��������:
 * 2. �����������½�Ŀ����ʵ���� new ָ��ʱ����ʼ�� new ָ���Ŀ����:
 * 3. ���������þ�̬������ָ��ʱ����ʼ���þ�̬�������ڵ���:
 * 4. ���������ʾ�̬�ֶε�ָ��ʱ����ʼ���þ�̬�ֶ����ڵ���:
 * 5. ����ĳ�ʼ���ᴥ������ĳ�ʼ��:
 * 6. ʹ�÷��� API ��ĳ������з������ʱ����ʼ�������:
 * 7. ���һ���ӿڶ����� default ��������ôֱ��ʵ�ֻ��߼��ʵ�ָýӿڵ���ĳ�ʼ�����ᴥ���ýӿڵĳ�ʼ��:???
 * 8. �����ε��� MethodHandle ʵ��ʱ����ʼ���� MethodHandle ָ��ķ������ڵ���.???
 *
 * ˼·:new �������͵�����
 * 1. ��֤�Ƿ����:
 *      javac Singleton.java    java -verbose:class Singleton    Ȼ���ɿ�����ʼ���������͵�����,�ᴥ���������͵ļ���
 * 2. ��֤�Ƿ�����:
 *      ��Ϊ���ӵĵ�һ������֤���غ��class�ֽ����Ƿ����JVM�淶,���Ե��޸����ɵ�class�ļ�,���Ƿ�ᱨ��,�������,��˵������������,���û�б���,��˵��*   û�н�������
 * �ܽ�:�½��������͵����飬ֻ����أ��������Ӻͳ�ʼ�������Ӻͳ�ʼ��������ʵ������ʱ�򴥷�
 */
public class Singleton
{
    private Singleton()
    {

    }

    /**
     * �������ʼ�����̰߳�ȫ�ģ����ҽ���ִ��һ�Σ���˳������ȷ�����̻߳��������ҽ���һ��
     * Singleton ʵ����
     */
    private static class LazyHolder
    {
        static final Singleton INSTANCE = new Singleton();
        static
        {
            System.out.println("LazyHolder.<clinit>");
        }
    }

    public static Object getInstance(boolean flag) {
        if (flag)
        {
            return new LazyHolder[2];
        }
        return LazyHolder.INSTANCE;
    }

    public static void main(String[] args)
    {
        getInstance(true);
        //System.out.println("---");
        //getInstance(false);
        //Singleton instance = LazyHolder.INSTANCE;
    }
}
