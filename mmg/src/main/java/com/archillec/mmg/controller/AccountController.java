package com.archillec.mmg.controller;

import com.archillec.common.api.CommonPage;
import com.archillec.common.api.CommonResult;
import com.archillec.mmg.entity.Account;
import com.archillec.mmg.mapper.AccountMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Archillec
 * @since 2023-01-24
 */
@Controller
@RequestMapping("/mmg/account")
public class AccountController {

    @Autowired
    private  AccountMapper accountMapper;

    @RequestMapping("getlist")
    @ResponseBody
    public Page<Account> getaccountlist(){
//        List<Account> list = this.accountMapper.selectList(null);
        Page<Account> page = new Page<>(1,3);
        accountMapper.selectPage(page,null);
//        System.out.println(page);
//        this.accountMapper.selectPage(page,null);

        return page;
    }
}
