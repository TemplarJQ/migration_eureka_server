package com.service.impl;

import com.dataobject.MigrationToken;
import com.service.MigrationService;
import org.springframework.stereotype.Service;

@Service
public class MigrationServiceImpl implements MigrationService {

    @Override
    public boolean migrationLockHandler(MigrationToken token) {



        return false;
    }

    @Override
    public boolean migrationUnLockHandler(MigrationToken token) {
        return false;
    }
}
