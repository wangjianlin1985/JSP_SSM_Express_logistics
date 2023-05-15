// 
// 
// 

package cn.oza.logistic.ssm.mapper;

import java.util.List;
import cn.oza.logistic.ssm.pojo.ExportExample;
import cn.oza.logistic.ssm.pojo.Export;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ExportMapper
{
    int insert(Export record);
    
    int insertSelective(Export record);
    
    List<Export> selectByExample(ExportExample example);
}
