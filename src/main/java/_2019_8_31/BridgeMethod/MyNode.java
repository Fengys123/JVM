package _2019_8_31.BridgeMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ʲôʱ��������Žӷ���
 * ����̳л���ʵ��һ��������߽ӿڵķ��ͷ���ʱ,����������ȷ��ָ���˷�������,
 * ��ô����ʱ,�������ͻ��Զ������Žӷ���(�������?)
 *
 * ΪʲôҪ�����Žӷ���?
 *
 * java�������Ὣ���з�˽�еķ�������Ϊ��Ҫ��̬�󶨵�����,��Ϊ��������ط������ܱ�������д
 */
public class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    @Override
    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        MyNode mn = new MyNode(5);
        Node n = mn;            // A raw type - compiler throws an unchecked warning
        n.setData("Hello");
        Integer x = mn.data;    // Causes a ClassCastException to be thrown.
    }
}
