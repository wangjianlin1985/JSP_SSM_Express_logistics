// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.BasicDataExample;
import cn.oza.logistic.ssm.pojo.BasicData;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.BasicDataMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.BasicDataService;

@Service
public class BasicDataServiceImpl implements BasicDataService
{
    @Autowired
    private BasicDataMapper basicDataMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long basicDataId) {
        return this.basicDataMapper.deleteByPrimaryKey(basicDataId);
    }
    
    @Override
    public int insert(final BasicData record) {
        return this.basicDataMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final BasicData record) {
        return this.basicDataMapper.insertSelective(record);
    }
    
    @Override
    public List<BasicData> selectByExample(final BasicDataExample example) {
        return this.basicDataMapper.selectByExample(example);
    }
    
    @Override
    public BasicData selectByPrimaryKey(final Long basicDataId) {
        return this.basicDataMapper.selectByPrimaryKey(basicDataId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final BasicData record) {
        return this.basicDataMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final BasicData record) {
        return this.basicDataMapper.updateByPrimaryKey(record);
    }
}
