package cc.dc.thread;

public class TestDemo2 {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println((Integer.MAX_VALUE + 1));

        String app_version = "3.1.0.1";
        String server_version = "4.0.1";

        int app_length = app_version.split("\\.").length;
        int server_length = server_version.split("\\.").length;
        int common_length = Math.max(server_length, app_length);
        int[] app_str = new int[common_length];
        int[] server_str = new int[common_length];
        for (int i = 0; i < app_length; i++) {
            app_str[i] = Integer.valueOf(app_version.split("\\.")[i]);
        }
        for (int i = 0; i < server_length; i++) {
            server_str[i] = Integer.valueOf(server_version.split("\\.")[i]);
        }

        for (int i = 0; i < common_length; i++) {
            if (app_str[i] < server_str[i]) {
                System.out.println("更新了。。。。。");
                return;
            }
        }
    }
}
