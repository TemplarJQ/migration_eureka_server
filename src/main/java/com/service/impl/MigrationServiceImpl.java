package com.service.impl;

import com.dataobject.MigrationToken;
import com.error.BusinessException;
import com.lock.RedisLock;
import com.service.MigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class MigrationServiceImpl implements MigrationService {

    //此处场景主要是多个springboot服务器访问同一个节点（即服务中心）的redis，因此用redis做一个分布式锁结构
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean migrationLockHandler(MigrationToken token) {



        return false;
    }

    @Override
    public boolean migrationUnLockHandler(MigrationToken token) {
        return false;
    }

    @Override
    public void migrationRedisLockHandler(MigrationToken token) throws BusinessException, InterruptedException {
        //上锁代码使用分布式锁进行
        RedisLock lock = new RedisLock(redisTemplate, token.getTokenCode(), 10000, 20000);

        try {
            if(lock.lock()) {
                //此前采取redis分布式锁，现已修改，保留原算法
            }
        } finally {
        //为了让分布式锁的算法的鲁棒性，持有锁的客户端在解锁之前应该再检查一次自己的锁是否已经超时，再去做DEL操作，因为可能客户端因为某个耗时的操作而挂起。
        //操作完的时候锁因为超时已经被别人获得，这时就不必解锁了。
        lock.unlock();
    }
    }
}
