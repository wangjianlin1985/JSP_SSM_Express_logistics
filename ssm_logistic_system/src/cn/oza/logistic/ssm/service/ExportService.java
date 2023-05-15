// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.ExportExample;
import cn.oza.logistic.ssm.pojo.Export;

public interface ExportService
{
    int insert(Export record);
    
    int insertSelective(Export record);
    
    List<Export> selectByExample(ExportExample example);
}
