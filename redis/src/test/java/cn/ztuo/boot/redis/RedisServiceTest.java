package cn.ztuo.boot.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.DefaultTypedTuple;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.*;

@SpringBootTest
public class RedisServiceTest {

    @Autowired
    RedisService redisService;

    @Test
    void addString() {
        redisService.addString("string","1234567890");
    }

    @Test
    void getString() {
        String value = redisService.getString("string");
        System.out.println(value);
    }

    @Test
    void pushList() {
        List<String> values = new ArrayList<String>();
        values.add("1");
        values.add("2");
        values.add("3");
        values.add("4");
        values.add("5");
        values.add("6");
        redisService.pushList("list",values);
    }

    @Test
    void popList() {
        String value = redisService.popList("list");
        System.out.println(value);
    }

    @Test
    void getList() {
        String value = redisService.getList("list",1);
        System.out.println(value);
    }

    @Test
    void addSet() {
        redisService.addSet("set","a","b","c","d","e","f");
    }

    @Test
    void getSet() {
        String value = redisService.getSet("set");
        System.out.println(value);
    }

    @Test
    void addHash() {
        Map<String,String> map=new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");
        redisService.addHash("hash",map);
    }

    @Test
    void getHash() {
        String value = redisService.getHash("hash","key3");
        System.out.println(value);
    }


    @Test
    void addZset() {
        ZSetOperations.TypedTuple<String> tuple1 = new DefaultTypedTuple<String>("p1", 1.1);
        ZSetOperations.TypedTuple<String> tuple2 = new DefaultTypedTuple<String>("p2", 2.1);
        ZSetOperations.TypedTuple<String> tuple3 = new DefaultTypedTuple<String>("p3", 3.1);
        ZSetOperations.TypedTuple<String> tuple4 = new DefaultTypedTuple<String>("p4", 4.1);
        ZSetOperations.TypedTuple<String> tuple5 = new DefaultTypedTuple<String>("p5", 5.1);
        Set<ZSetOperations.TypedTuple> zset = new HashSet<ZSetOperations.TypedTuple>();
        zset.add(tuple1);
        zset.add(tuple2);
        zset.add(tuple3);
        zset.add(tuple4);
        zset.add(tuple5);
        redisService.addZset("zset",zset);
    }

    @Test
    void getZset() {
        Double value = redisService.getZset("zset","p2");
        System.out.println(value);
    }


}