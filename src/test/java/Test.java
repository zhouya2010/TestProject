import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by junjun on 2017/2/7.
 */
public class Test {

    public static void main(String[] args) {
//        //连接本地的 Redis 服务
//        Jedis jedis = new Jedis("112.74.182.214");
////        jedis.auth("4D@yanfabu");
//        System.out.println("Connection to server sucessfully");
//
//        // 获取数据并输出
//        Set<String> set = jedis.keys("*");
//
//        for (String str : set) {
//            System.out.println(str);
//        }


        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for (String temp : a) {
            if ("2".equals(temp)) {
                a.remove(temp);
            }
        }

        for (String temp : a) {
            System.out.println(temp);
        }
    }

}
