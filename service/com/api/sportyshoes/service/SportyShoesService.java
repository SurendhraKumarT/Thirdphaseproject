package com.api.sportyshoes.service;

import java.util.Date;
import java.util.List;

import com.api.sportyshoes.exceptionHandler.BusinessException;
import com.api.sportyshoes.model.PurchaseReport;
import com.api.sportyshoes.model.Shoes;

public interface SportyShoesService {
	
	public Shoes createShoe(Shoes shoe) throws BusinessException;
	public Shoes getShoeById(int id) throws BusinessException;
	public Shoes updateShoe(Shoes shoe);
	public void deleteShoeById(int id) throws BusinessException;
	public List<Shoes> getAllShoes();
	
	public PurchaseReport createPurchaseReport(PurchaseReport pr) throws BusinessException;
	public PurchaseReport getPurchaseReportById(int id) throws BusinessException;
	public PurchaseReport updatePurchaseReport(PurchaseReport pr);
	public void deletePurchaseReportById(int id) throws BusinessException;
	public List<PurchaseReport> getAllPurchaseReports();
	public List<com.api.sportyshoes.model.PurchaseReport> getAllPurchaseReportsByCategory(String category);
	public <PurchaseReport> List<PurchaseReport> getAllPurchaseReportsByDOP(Date dop);

}