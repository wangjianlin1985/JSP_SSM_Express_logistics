// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.ExportDetailExample;
import cn.oza.logistic.ssm.pojo.ExportDetail;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.ExportDetailMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.ExportDetailService;

@Service
public class ExportDetailServiceImpl implements ExportDetailService
{
    @Autowired
    private ExportDetailMapper exportDetailMapper;
    
    @Override
    public int insert(final ExportDetail record) {
        return this.exportDetailMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final ExportDetail record) {
        return this.exportDetailMapper.insertSelective(record);
    }
    
    @Override
    public List<ExportDetail> selectByExample(final ExportDetailExample example) {
        return this.exportDetailMapper.selectByExample(example);
    }
}
