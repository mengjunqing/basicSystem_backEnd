package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ChkApplicationInfo;

/**
 * application_infoService接口
 * 
 * @author jc.men
 * @date 2024-03-04
 */
public interface IChkApplicationInfoService 
{
    /**
     * 查询application_info
     * 
     * @param id application_info主键
     * @return application_info
     */
    public ChkApplicationInfo selectChkApplicationInfoById(Long id);

    /**
     * 查询application_info列表
     * 
     * @param chkApplicationInfo application_info
     * @return application_info集合
     */
    public List<ChkApplicationInfo> selectChkApplicationInfoList(ChkApplicationInfo chkApplicationInfo);

    /**
     * 新增application_info
     * 
     * @param chkApplicationInfo application_info
     * @return 结果
     */
    public int insertChkApplicationInfo(ChkApplicationInfo chkApplicationInfo);

    /**
     * 修改application_info
     * 
     * @param chkApplicationInfo application_info
     * @return 结果
     */
    public int updateChkApplicationInfo(ChkApplicationInfo chkApplicationInfo);

    /**
     * 批量删除application_info
     * 
     * @param ids 需要删除的application_info主键集合
     * @return 结果
     */
    public int deleteChkApplicationInfoByIds(Long[] ids);

    /**
     * 删除application_info信息
     * 
     * @param id application_info主键
     * @return 结果
     */
    public int deleteChkApplicationInfoById(Long id);
}
