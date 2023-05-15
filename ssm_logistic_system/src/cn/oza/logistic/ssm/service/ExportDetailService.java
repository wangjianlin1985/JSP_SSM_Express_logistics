// 
// 
// 

package cn.oza.logistic.ssm.service;

import java.util.List;
import cn.oza.logistic.ssm.pojo.ExportDetailExample;
import cn.oza.logistic.ssm.pojo.ExportDetail;

public interface ExportDetailService
{
    int insert(ExportDetail record);
    
    int insertSelective(ExportDetail record);
    
    List<ExportDetail> selectByExample(ExportDetailExample example);
}
