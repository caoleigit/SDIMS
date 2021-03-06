package top.lothar.sdims.service;

import java.util.List;

import top.lothar.sdims.dto.TExecution;
import top.lothar.sdims.entity.Supplier;

public interface PurchaseSupplierService {
	/**
	 * 添加供貨商
	 * @param supplier
	 * @return
	 */
	int addPurchaseSupplier(Supplier supplier);
	/**
	 * 根据ID删除指定供货商
	 * @param supplierId
	 * @return
	 */
	int removePurchaseSupplier(long supplierId);
	/**
	 * 更新供货商
	 * @param supplier
	 * @return
	 */
	int modifyPurchaseSupplier(Supplier supplier);
	/**
	 * 根据ID查询供货商
	 * @param supplierId
	 * @return
	 */
	Supplier getPurchaseSupplierById(long supplierId);
	/**
	 * 得到所有供应商，并去渲染采购单生成时候select的供应商信息
	 * @return
	 */
	List<Supplier> getAllSupplierList();
	/**
	 * 条件查询供货商列表，泛型返回供货商集合
	 * @param supplierName
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	TExecution<Supplier> getPurchaseSupplierList(String supplierName,int pageIndex,int pageSize);
}
