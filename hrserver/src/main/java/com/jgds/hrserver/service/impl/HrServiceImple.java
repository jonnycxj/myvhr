package com.jgds.hrserver.service.impl;

import com.jgds.hrserver.dao.HrPojoMapper;
import com.jgds.hrserver.pojo.HrPojo;
import com.jgds.hrserver.pojo.HrPojoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrServiceImple implements UserDetailsService {

    @Autowired
    HrPojoMapper hrPojoMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username+"================================");
        HrPojoExample hrPojoExample = new HrPojoExample();
        hrPojoExample.createCriteria().andUsernameLike(username);
//        HrPojo hrPojo = hrPojoMapper.loadUserByUsername(username);
        List<HrPojo> hrPojo = hrPojoMapper.selectByExample(hrPojoExample);
        if (hrPojo==null||hrPojo.size()!=1){
           throw  new UsernameNotFoundException("用户名不存在");
       }
    return hrPojo.get(0);
    }
}
