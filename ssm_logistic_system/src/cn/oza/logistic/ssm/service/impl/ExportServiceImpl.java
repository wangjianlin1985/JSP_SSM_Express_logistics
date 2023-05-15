// 
// 
// 

package cn.oza.logistic.ssm.service.impl;

import java.util.List;
import cn.oza.logistic.ssm.pojo.ExportExample;
import cn.oza.logistic.ssm.pojo.Export;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.mapper.ExportMapper;
import org.springframework.stereotype.Service;
import cn.oza.logistic.ssm.service.ExportService;

@Service
public class ExportServiceImpl implements ExportService
{
    @Autowired
    private ExportMapper exportMapper;
    
    @Override
    public int insert(final Export record) {
        return this.exportMapper.insert(record);
    }
    
    @Override
    public int insertSelective(final Export record) {
        return this.exportMapper.insertSelective(record);
    }
    
    @Override
    public List<Export> selectByExample(final ExportExample example) {
        return this.exportMapper.selectByExample(example);
    }
}
