package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ChkServiceFileLimit;
import com.ruoyi.system.service.IChkServiceFileLimitService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【関数名に記入してください】Controller
 * 
 * @author ruoyi
 * @date 2024-03-01
 */
@RestController
@RequestMapping("/system/limit")
public class ChkServiceFileLimitController extends BaseController
{
    @Autowired
    private IChkServiceFileLimitService chkServiceFileLimitService;

    /**
     * 查询【関数名に記入してください】列表
     */
    @PreAuthorize("@ss.hasPermi('system:limit:list')")
    @GetMapping("/list")
    public TableDataInfo list(ChkServiceFileLimit chkServiceFileLimit)
    {
        startPage();
        List<ChkServiceFileLimit> list = chkServiceFileLimitService.selectChkServiceFileLimitList(chkServiceFileLimit);
        return getDataTable(list);
    }

    /**
     * 导出【関数名に記入してください】列表
     */
    @PreAuthorize("@ss.hasPermi('system:limit:export')")
    @Log(title = "【関数名に記入してください】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ChkServiceFileLimit chkServiceFileLimit)
    {
        List<ChkServiceFileLimit> list = chkServiceFileLimitService.selectChkServiceFileLimitList(chkServiceFileLimit);
        ExcelUtil<ChkServiceFileLimit> util = new ExcelUtil<ChkServiceFileLimit>(ChkServiceFileLimit.class);
        util.exportExcel(response, list, "【関数名に記入してください】数据");
    }

    /**
     * 获取【関数名に記入してください】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:limit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(chkServiceFileLimitService.selectChkServiceFileLimitById(id));
    }

    /**
     * 新增【関数名に記入してください】
     */
    @PreAuthorize("@ss.hasPermi('system:limit:add')")
    @Log(title = "【関数名に記入してください】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ChkServiceFileLimit chkServiceFileLimit)
    {
        return toAjax(chkServiceFileLimitService.insertChkServiceFileLimit(chkServiceFileLimit));
    }

    /**
     * 修改【関数名に記入してください】
     */
    @PreAuthorize("@ss.hasPermi('system:limit:edit')")
    @Log(title = "【関数名に記入してください】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ChkServiceFileLimit chkServiceFileLimit)
    {
        return toAjax(chkServiceFileLimitService.updateChkServiceFileLimit(chkServiceFileLimit));
    }

    /**
     * 删除【関数名に記入してください】
     */
    @PreAuthorize("@ss.hasPermi('system:limit:remove')")
    @Log(title = "【関数名に記入してください】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(chkServiceFileLimitService.deleteChkServiceFileLimitByIds(ids));
    }
}
