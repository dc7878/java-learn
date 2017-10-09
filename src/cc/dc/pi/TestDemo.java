package cc.dc.pi;

/**
 * 计算圆周率π
 * 计算来源
 * http://www.cppfans.com/articles/basecalc/c_pi_10000.asp
 */
public class TestDemo {
    
    //定义数组大小
    private static int ARR_SIZE = 1010;
    // 显示位数
    private static int SHOW_COUNT = 1000;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        long startTime = System.currentTimeMillis();
        int[] x = new int[ARR_SIZE];
        int[] z = new int[ARR_SIZE];
        int a=1, b=3, c, d, run=1, count=0;
        x[1] = 2;
        z[1] = 2;
        while((run > 0) && (++count < 200000000))
        {
            d = 0;
            for(int i = ARR_SIZE -1; i>0; i--)
            {
                c = z[i]*a + d;
                z[i] = c % 10;
                d = c / 10;
            }
            d = 0;
            for(int i = 0; i< ARR_SIZE; i++)
            {
                c = z[i]+d*10;
                z[i] = c / b;
                d = c % b;
            }
            run = 0;
            for(int i = ARR_SIZE - 1; i > 0; i--)
            {
                c = x[i] + z[i];
                x[i] = c%10;
                x[i-1] += c/10;
                run |= z[i];
            }
            a++;
            b+=2;
        }
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i< SHOW_COUNT; i++)
        {
            if(i != 0 && (i % 100 == 0)) {
                buffer.append("\n");
            } else {
                buffer.append("" + x[i+2]);
            }
        }
        System.out.println((System.currentTimeMillis() - startTime) + "ms");
        System.out.println("计算了"+count + "次");
        System.out.println(x[1]+".");
        System.out.println(buffer.toString());
        System.out.println(buffer.toString().length());
    }
}
