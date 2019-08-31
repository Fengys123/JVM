package _2019_8_27.Option;
import	java.util.function.Consumer;

import java.util.Optional;

public class main
{
    public static void main(String[] args)
    {
        Optional<String> op = Optional.ofNullable("123");
        op.ifPresent(u -> {
            System.out.println(u);
        });
        op.ifPresent(new Consumer<String>()
        {
            @Override
            public void accept(String s)
            {
                System.out.println(s);
            }
        });
        op.ifPresent(new ConsumerImpl());
    }

    /**
     * ��������Ϊ�õ���visit mode,������ϸһ��������,��¼һ��
     */
    static class ConsumerImpl implements Consumer<String>
    {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }
}
