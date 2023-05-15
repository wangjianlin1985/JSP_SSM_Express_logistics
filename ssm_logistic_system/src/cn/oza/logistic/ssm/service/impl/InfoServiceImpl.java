// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.InfoExample;
import cn.oza.logistic.ssm.pojo.Info;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.InfoMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService
{
    @Autowired
    private InfoMapper infoMapper;
    
    @Override
    public int deleteByPrimaryKey(final Long orderId) {
        return this.infoMapper.deleteByPrimaryKey(orderId);
    }
    
    @Override
    public int insert(final Info record) {
        return this.infoMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final Info record) {
        return this.infoMapper.insertSelective(record);
    }
    
    @Override
    public List<Info> selectByExample(final InfoExample example) {
        return this.infoMapper.selectByExample(example);
    }
    
    @Override
    public Info selectByPrimaryKey(final Long orderId) {
        return this.infoMapper.selectByPrimaryKey(orderId);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Info record) {
        return this.infoMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int updateByPrimaryKey(final Info record) {
        return this.infoMapper.updateByPrimaryKey(record);
    }
}
