package _2019_8_27.ClassLoader;

/**
 * 1.Ԥ����.���������ʱ����, ���ص���JAVA_HOME/lib/�µ�rt.jar�µ�.class�ļ�, ���jar������������ǳ�������ʱ�ǳ������õ���, ��java.lang.*��java.util.*��java.io.*�ȵȣ�
 *      ������������һ�����. Ҫ֤����һ��ܼ�, дһ���յ�main����, �������������Ϊ"-XX:+TraceClassLoading"����ȡ�������Ϣ,����һ��.
 * 2.����ʱ���ء���������õ�һ��.class�ļ���ʱ�򣬻���ȥ�ڴ��в鿴һ�����.class�ļ���û�б����أ����û�оͻᰴ�����ȫ�޶�������������ࡣ
 *
 * ���ؽ׶�����������:
 *      1.��ȡ.class�ļ��Ķ�������
 *      2.������Ϣ,��̬����,�ֽ���,������Щ.class�ļ��е����ݷ��뷽��ȥ
 *      3.���ڴ�������һ���������.class�ļ���java.lang.Class����, ��Ϊ�����������ĸ������ݵķ�����ڡ�һ�����Class���ڶ���ģ�����HotSpot������Ƚ����⣬���Class�����Ƿ��ڷ������е�
 * �� ��zip���л�ȡ��������Ժ�jar��ear��war��ʽ�Ļ���
 * �� �������л�ȡ������Ӧ�þ���Applet
 * �� ����ʱ�������ɣ�����Ӧ�þ��Ƕ�̬������
 * �� �������ļ����ɣ�����Ӧ�þ���JSP������JSP���ɶ�Ӧ��.class�ļ�
 * �� �����ݿ��ж�ȡ�����ֳ����Ƚ��ټ�
 */
public class ClassLoading
{
    public static void main(String[] args)
    {
        //�����������(Bootstrap ClassLoader)��������ص���JAVA_HOME/lib�µ���⣬ϵͳ��������޷���Java����ֱ��Ӧ��
        //��չ�������(Extension ClassLoader)
        System.out.println(System.getProperty("java.ext.dirs"));

        //Ӧ�ó����������(Application ClassLoader)
        System.out.println(ClassLoader.getSystemClassLoader());

        System.out.println(ClassLoader.getSystemClassLoader().getParent());

        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());

        //Application ClassLoaderֻ�ܼ�����ĿbinĿ¼�µ�.class�ļ�.
        System.out.println(System.getProperty("java.class.path"));

        /**
         * ˫��ί��ԭ��(JDK1.2����)
         *      1.���һ����������յ�������ص����������Ȳ����Լ�ȥ���Լ�������࣬���ǰ��������ί�ɸ����������ȥ��ɣ�ÿһ����ε��������������ˡ�
         *      2.ֻ�е��������������Լ��޷���������������������������Χ��û���ҵ�������ࣩʱ���Ӽ������Ż᳢���Լ�ȥ����
         * why has ?
         *      ��ʵ���еļ����������ն�Ӧ�ô��͵������������������С�˫��ί��ģ�Ͷ���Java������ȶ���������Ҫ����ΪJava���������ļ�����һ��߱���һ�ִ������ȼ��Ĳ�ι�ϵ��
         *      ����java.lang.Object�������rt.jar�У�������һ���������Ҫȥ��������࣬���ն�����Bootstrap ClassLoaderȥ���أ����Object���ڳ���ĸ���������������ж���һ���ࡣ
         *      �෴�����û��˫��ί��ģ�ͣ��ɸ������Լ�ȥ���صĻ�������û��Լ���д��һ��java.lang.Object��������CLASSPATH�£���ϵͳ�н�����ֶ����ͬ��Object�࣬
         *      Java��ϵ�����������ΪҲ���޷���֤��Ӧ�ó���Ҳ������һƬ���ҡ�
         */
    }
}
