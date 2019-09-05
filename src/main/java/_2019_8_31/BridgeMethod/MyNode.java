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
 * java�������Ὣ���з�˽��ʵ�������ĵ��ö�����Ϊ��Ҫ��̬�󶨵�����,��Ϊ��������ط������ܱ�������д
 *
 * java������еľ�̬��: �ڽ���ʱ,���ܹ�ֱ��ʶ��Ŀ�귽�������
 * java������еĶ�̬��:��Ҫ�����й�����,���ݵ����ߵĶ�̬������ʶ��Ŀ�귽�������
 *
 * ����invokestatic��invokespecial, java������ܹ�ֱ��ʶ��Ŀ�귽��
 * ����invokevirtual��invokeinterface, �������Ҫ����ִ�й�����,���ݵ����ߵĶ�̬����,��ȷ�������Ŀ�귽��
 *
 * java��Constant Pool�������Щ����?
 *
 * �ڱ��������,���ǲ���֪��Ŀ�귽���ľ����ַ, ���, java����������ʱ�÷�����������ʾ��Ŀ�귽��.
 * ��һ�������ð���  Ŀ�귽�����ڵ�����߽ӿڵ�����,  Ŀ�귽���ķ�����,  ����������.
 * �������ô洢��class�ļ��ĳ�������, ��Ϊ  �ӿڷ�������  �Լ�  �ǽӿڷ�������
 *
 * ��ִ���ֽ���֮ǰ, java�������Ҫ������Щ��������,���滻Ϊʵ������.
 * ���ڿ��Ծ�̬�󶨵ķ������ö���,ʵ��������һ��ָ�򷽷���ָ��.
 * ���ڶ�̬�󶨵ķ������ö���, ʵ����������һ�������������.
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
