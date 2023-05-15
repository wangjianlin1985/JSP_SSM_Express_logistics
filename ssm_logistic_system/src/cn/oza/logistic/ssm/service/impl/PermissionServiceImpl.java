// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.PermissionExample;
import cn.oza.logistic.ssm.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.PermissionMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService
{
    @Autowired
    private PermissionMapper permissionMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long permissionId) {
        return this.permissionMapper.deleteByPrimaryKey(permissionId);
    }
    
    @Override
    public int insert(final Permission record) {
        return this.permissionMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final Permission record) {
        return this.insertSelective(record);
    }
    
    @Override
    public List<Permission> selectByExample(final PermissionExample example) {
        return this.permissionMapper.selectByExample(example);
    }
    
    @Override
    public Permission selectByPrimaryKey(final Long permissionId) {
        return this.permissionMapper.selectByPrimaryKey(permissionId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Permission record) {
        return this.permissionMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final Permission record) {
        return this.permissionMapper.updateByPrimaryKey(record);
    }
}
