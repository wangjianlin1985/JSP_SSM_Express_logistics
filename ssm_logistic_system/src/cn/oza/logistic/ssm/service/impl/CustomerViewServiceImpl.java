// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.CustomerViewExample;
import cn.oza.logistic.ssm.pojo.CustomerView;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.CustomerViewMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.CustomerViewService;

@Service
public class CustomerViewServiceImpl implements CustomerViewService
{
    @Autowired
    private CustomerViewMapper customerViewMapper;
    
    @Override
    public int insert(final CustomerView record) {
        return this.customerViewMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final CustomerView record) {
        return this.customerViewMapper.insertSelective(record);
    }
    
    @Override
    public List<CustomerView> selectByExample(final CustomerViewExample example) {
        return this.customerViewMapper.selectByExample(example);
    }
}
