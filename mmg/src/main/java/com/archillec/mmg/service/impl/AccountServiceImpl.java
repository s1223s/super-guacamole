package com.archillec.mmg.service.impl;

import com.archillec.mmg.entity.Account;
import com.archillec.mmg.mapper.AccountMapper;
import com.archillec.mmg.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Archillec
 * @since 2023-01-24
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
