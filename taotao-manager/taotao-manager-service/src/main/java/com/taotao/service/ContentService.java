package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {

	TaotaoResult insertContent(TbContent content);
	EUDataGridResult getContentListByCat(int page, int rows, String categoryId);
}
