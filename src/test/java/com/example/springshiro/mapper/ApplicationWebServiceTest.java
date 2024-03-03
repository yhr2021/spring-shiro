package com.example.springshiro.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springshiro.SpringShiroApplication;
import com.example.springshiro.entity.Account;
import com.example.springshiro.mapper.AccountMapper;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月11日 下午6:16:21 
 * @version 1.0 
 * @parameter 
 * @since 普通业务服务层测试
 * @return 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringShiroApplication.class) // 指定启动类
public class ApplicationWebServiceTest {
	protected static Logger logger = LoggerFactory.getLogger(ApplicationWebServiceTest.class);

	@Autowired
	private AccountMapper demoService;

	/**
	 * 测试方法
	 *
	 * @throws Exception
	 */
	@Test
	public void testService() throws Exception {
		QueryWrapper<Account> queryWrapper = new QueryWrapper<>();
		List<Account> accounts = demoService.selectList(queryWrapper);
		System.out.println(accounts);
	}
}
