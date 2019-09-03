package _2019_8_31;

/**
 * ���ط��������ȼ���
 * 1.�ڲ����ǶԻ��������Զ�װ���䣬�Լ��ɱ䳤�����������ѡȡ���ط�����
 * 2.����ڵ� 1 ���׶���û���ҵ�����ķ�������ô�������Զ�װ���䣬��������ɱ䳤�����������ѡȡ���ط�����
 * 3.����ڵ� 2 ���׶���û���ҵ�����ķ�������ô�������Զ�װ�����Լ��ɱ䳤�����������ѡȡ���ط�����
 *
 * ���java��ͬһ�׶��ҵ��˶������ķ���������ѡ��һ����Ϊ���еġ�
 * 1.�������еĹؼ��ǣ���ʽ�������͵ļ̳й�ϵ
 */
public class TestManyParam {

    public static void invoke(Object object, Object ...objects) {
        System.out.println("ִ�з���1");
    }

    public static void invoke(String s, Object object, Object ...objects) {
        System.out.println("ִ�з���2");
    }

    /**
     * ��֤��װ��
     */
    public static void invoke(Integer i) {
        System.out.println("ִ�з���1");
    }

    public static void invoke(int i) {
        System.out.println("ִ�з���2");
    }

    public static void invoke(int...i){
        System.out.println("ִ�з���3");
    }

    public static void invoke(Integer...i){
        System.out.println("ִ�з���4");
    }

    public static void invoke1(Object object)
    {
        System.out.println("ִ�з���1");
    }

    public static void invoke1(String strObject)
    {
        System.out.println("ִ�з���2");
    }


    public static void main(String[] args) {
        /*invoke(null, 1);
        invoke(null,1, 2);*/
        invoke(null, new Object[]{1});

        System.out.println("~~~~~~~~~~~~~~");

        invoke(1);
        invoke(new Integer(1));

        System.out.println("~~~~~~~~~~~~~~");

        invoke1(null);
        invoke1(null);
    }
}
