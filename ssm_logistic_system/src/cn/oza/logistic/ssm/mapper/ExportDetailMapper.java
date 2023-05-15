// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.ExportDetailExample;
import cn.oza.logistic.ssm.pojo.ExportDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ExportDetailMapper
{
    int insert(ExportDetail record);
    
    int insertSelective(ExportDetail record);
    
    List<ExportDetail> selectByExample(ExportDetailExample example);
}
