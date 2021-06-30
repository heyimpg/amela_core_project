import java.util.Arrays;


class ChuNhat {
    public int rong, dai;

    public ChuNhat(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }
}

public class test {
    void method(ChuNhat x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        test o = new test();
        ChuNhat cn = new ChuNhat(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}