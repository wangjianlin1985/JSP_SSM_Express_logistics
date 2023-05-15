// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.RoleExample;
import cn.oza.logistic.ssm.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.RoleMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService
{
    @Autowired
    private RoleMapper roleMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long roleId) {
        return this.roleMapper.deleteByPrimaryKey(roleId);
    }
    
    @Override
    public int insert(final Role record) {
        return this.roleMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final Role record) {
        return this.roleMapper.insertSelective(record);
    }
    
    @Override
    public List<Role> selectByExample(final RoleExample example) {
        return this.roleMapper.selectByExample(example);
    }
    
    @Override
    public Role selectByPrimaryKey(final Long roleId) {
        return this.roleMapper.selectByPrimaryKey(roleId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Role record) {
        return this.roleMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final Role record) {
        return this.roleMapper.updateByPrimaryKey(record);
    }
}
