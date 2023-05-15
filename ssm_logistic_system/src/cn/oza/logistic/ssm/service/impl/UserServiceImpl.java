// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.UserExample;
import cn.oza.logistic.ssm.pojo.User;
import cn.oza.logistic.ssm.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.UserMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long userId) {
        return this.userMapper.deleteByPrimaryKey(userId);
    }
    
    @Override
    public int insert(final User record) {
        return this.userMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final User record) {
        return this.userMapper.insertSelective(record);
    }
    
    @Override
    public List<User> selectByExample(final UserExample example) {
        return this.userMapper.selectByExample(example);
    }
    
    @Override
    public User selectByPrimaryKey(final Long userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final User record) {
        return this.userMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final User record) {
        return this.userMapper.updateByPrimaryKey(record);
    }
}
