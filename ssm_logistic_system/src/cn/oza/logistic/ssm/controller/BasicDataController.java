// 
// 
// 

package cn.oza.logistic.ssm.controller;

import org.springframework.ui.Model;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import cn.oza.logistic.ssm.pojo.BasicDataExample;
import com.github.pagehelper.PageHelper;
import cn.oza.logistic.ssm.pojo.BasicData;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import cn.oza.logistic.ssm.service.BasicDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/basicData" })
public class BasicDataController
{
    @Autowired
    private BasicDataService basicDataService;
    
    @RequestMapping({ "/list" })
    @RequiresPermissions({ "basicData:list" })
    public String basicDataList() {
        return "basicData/list";
    }
    
    @ResponseBody
    @RequestMapping({ "/getBasicDatas" })
    @RequiresPermissions({ "basicData:list" })
    public PageInfo<BasicData> getBasicDatas(final String keyWord, @RequestParam(defaultValue = "1") final Integer pageNum, @RequestParam(defaultValue = "10") final Integer pageSize) {
        PageHelper.startPage((int)pageNum, (int)pageSize);
        final BasicDataExample basicDataExample = new BasicDataExample();
        if (StringUtils.isNotBlank((CharSequence)keyWord)) {
            final BasicDataExample.Criteria criteriaName = basicDataExample.createCriteria();
            criteriaName.andBaseNameLike("%" + keyWord + "%");
        }
        final List<BasicData> basicDatas = this.basicDataService.selectByExample(basicDataExample);
        final PageInfo<BasicData> pageInfo = (PageInfo<BasicData>)new PageInfo((List)basicDatas);
        return pageInfo;
    }
    
    @ResponseBody
    @RequestMapping({ "/delete" })
    @RequiresPermissions({ "basicData:delete" })
    public Map<String, String> delete(final Long[] basicDataIds) {
        final HashMap<String, String> map = new HashMap<String, String>();
        if (basicDataIds.length != 1) {
            int success = 0;
            final int total = basicDataIds.length;
            for (final Long basicDataId : basicDataIds) {
                success += this.basicDataService.deleteByPrimaryKey(basicDataId);
            }
            map.put("status", "true");
            map.put("info", "\u6210\u529f\u5220\u9664\u9009\u4e2d " + total + " \u6570\u636e\u4e2d\u7684 " + success + " \u4e2a\u6570\u636e");
            return map;
        }
        final int res = this.basicDataService.deleteByPrimaryKey(basicDataIds[0]);
        if (res == 1) {
            map.put("status", "true");
            map.put("info", "\u5220\u9664\u6210\u529f\uff01");
            return map;
        }
        map.put("status", "false");
        map.put("info", "\u5220\u9664\u5931\u8d25\uff01\u6570\u636e\u5df2\u7ecf\u4e0d\u5b58\u5728");
        return map;
    }
    
    @RequestMapping({ "/add" })
    @RequiresPermissions({ "basicData:insert" })
    public String addAdmin(final Model m) {
        final BasicDataExample basicDataExample = new BasicDataExample();
        final BasicDataExample.Criteria criteria = basicDataExample.createCriteria();
        criteria.andParentIdIsNull();
        final List<BasicData> basicDatas = this.basicDataService.selectByExample(basicDataExample);
        m.addAttribute("basicDatas", (Object)basicDatas);
        return "basicData/add";
    }
    
    @ResponseBody
    @RequestMapping({ "/checkBasicData" })
    @RequiresPermissions({ "basicData:list" })
    public Boolean checkPermission(final String name, final String curName) {
        if (curName != null && name.equals(curName)) {
            return true;
        }
        final BasicDataExample basicDataExample = new BasicDataExample();
        final BasicDataExample.Criteria criteria = basicDataExample.createCriteria();
        criteria.andBaseNameEqualTo(name);
        if (this.basicDataService.selectByExample(basicDataExample).size() != 0) {
            return false;
        }
        return true;
    }
    
    @ResponseBody
    @RequestMapping({ "/insert" })
    @RequiresPermissions({ "basicData:insert" })
    public Boolean insert(final BasicData basicData) {
        final int res = this.basicDataService.insert(basicData);
        if (res == 1) {
            return true;
        }
        return false;
    }
    
    @RequestMapping({ "/edit" })
    @RequiresPermissions({ "basicData:update" })
    public String edit(final Model m, final Long basicDataId) {
        m.addAttribute("myBasicData", (Object)this.basicDataService.selectByPrimaryKey(basicDataId));
        final BasicDataExample basicDataExample = new BasicDataExample();
        final BasicDataExample.Criteria criteria = basicDataExample.createCriteria();
        criteria.andParentIdIsNull();
        m.addAttribute("basicDatas", (Object)this.basicDataService.selectByExample(basicDataExample));
        return "basicData/edit";
    }
    
    @ResponseBody
    @RequestMapping({ "/update" })
    @RequiresPermissions({ "basicData:update" })
    public Boolean update(final BasicData basicData) {
        final int res = this.basicDataService.updateByPrimaryKey(basicData);
        if (res == 1) {
            return true;
        }
        return false;
    }
}
