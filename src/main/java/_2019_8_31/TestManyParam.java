package _2019_8_31;

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


    /**
     * ���ص�ѡȡ����:
     * 1.
     * @param args
     */
    public static void main(String[] args) {
        /*invoke(null, 1);
        invoke(null,1, 2);*/
        invoke(null, new Object[]{1});

        System.out.println("~~~~~~~~~~~~~~");

        invoke(1);
        invoke(new Integer(1));
    }
}
