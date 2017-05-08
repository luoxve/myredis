package org.vvl.main.java;

import redis.clients.jedis.Jedis;

public class Chapter01 {
    public static void main(String[] args) {
        new Chapter01().run();
    }

    public void run() {
        Jedis conn = new Jedis("192.168.1.102", 6379);
//        conn.select(15);
        conn.set("foo", "bar");
        System.out.println(conn.get("foo"));
        conn.close();
    }
}
