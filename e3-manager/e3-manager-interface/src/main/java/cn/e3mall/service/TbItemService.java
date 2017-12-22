package cn.e3mall.service;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;

public interface TbItemService {

	TbItem getTbItemById(long id);
	DataGridResult getTbItemListDataGrid(int page,int rows);
}
