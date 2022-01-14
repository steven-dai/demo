package cn.ztuo.boot.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author steven
 * @date 2021-11-03 19:50
 */
@Component
public class RedisService {

    @Resource
    RedisTemplate redisTemplate;

    /**
     * String操作
     * @param key key
     * @param value value
     */
    public void addString(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String getString(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

    /**
     * List操作
     * @param key key
     * @param value value
     */
    public void pushList(String key, List<String> value) {
        redisTemplate.opsForList().rightPushAll(key, value);
    }

    public String popList(String key) {
        return (String) redisTemplate.opsForList().rightPop(key);
    }

    public String getList(String key, Integer index) {
        return (String) redisTemplate.opsForList().index(key, index);
    }

    /**
     * Set操作
     * @param key key
     * @param value value
     */
    public void addSet(String key, String... value){
        redisTemplate.opsForSet().add(key,value);
    }

    public String getSet(String key){
        return (String) redisTemplate.opsForSet().randomMember(key);
    }

    /**
     * Hash操作
     * @param key key
     * @param value value
     */
    public void addHash(String key, Map<String,String> value){
        redisTemplate.opsForHash().putAll(key,value);
    }

    public String getHash(String key,String hashKey){
        return (String) redisTemplate.opsForHash().get(key,hashKey);
    }

    /**
     * Zset操作
     * @param key key
     * @param value value
     */
    public void addZset(String key, Set<ZSetOperations.TypedTuple> value){
        redisTemplate.opsForZSet().add(key,value);
    }

    public Double getZset(String key,String zsetKey){
        return redisTemplate.opsForZSet().score(key,zsetKey);
    }

}
