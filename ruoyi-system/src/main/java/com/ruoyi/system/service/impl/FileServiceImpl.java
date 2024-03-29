package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FileMapper;
import com.ruoyi.system.domain.File;
import com.ruoyi.system.service.IFileService;

/**
 * 【関数名に記入してください】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-01
 */
@Service
public class FileServiceImpl implements IFileService 
{
    @Autowired
    private FileMapper fileMapper;

    /**
     * 查询【関数名に記入してください】
     * 
     * @param id 【関数名に記入してください】主键
     * @return 【関数名に記入してください】
     */
    @Override
    public File selectFileById(Long id)
    {
        return fileMapper.selectFileById(id);
    }

    /**
     * 查询【関数名に記入してください】列表
     * 
     * @param file 【関数名に記入してください】
     * @return 【関数名に記入してください】
     */
    @Override
    public List<File> selectFileList(File file)
    {
        return fileMapper.selectFileList(file);
    }

    /**
     * 新增【関数名に記入してください】
     * 
     * @param file 【関数名に記入してください】
     * @return 结果
     */
    @Override
    public int insertFile(File file)
    {
        return fileMapper.insertFile(file);
    }

    /**
     * 修改【関数名に記入してください】
     * 
     * @param file 【関数名に記入してください】
     * @return 结果
     */
    @Override
    public int updateFile(File file)
    {
        return fileMapper.updateFile(file);
    }

    /**
     * 批量删除【関数名に記入してください】
     * 
     * @param ids 需要删除的【関数名に記入してください】主键
     * @return 结果
     */
    @Override
    public int deleteFileByIds(Long[] ids)
    {
        return fileMapper.deleteFileByIds(ids);
    }

    /**
     * 删除【関数名に記入してください】信息
     * 
     * @param id 【関数名に記入してください】主键
     * @return 结果
     */
    @Override
    public int deleteFileById(Long id)
    {
        return fileMapper.deleteFileById(id);
    }
}
