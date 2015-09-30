package com.vl.marketing.model;

import java.util.ArrayList;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
	
	private final StringProperty vlNum;
	private final StringProperty sku;
	private final StringProperty type;
	private final DoubleProperty originalSRP;
	private final DoubleProperty normalCost;
	private final DoubleProperty promoPrice;
	private final DoubleProperty promoCost;
	private final DoubleProperty ber;
	private final StringProperty requestNum;
	private ArrayList<String> strings = new ArrayList<String>();
	private ArrayList<Double> doubles = new ArrayList<Double>();

	public Item(String vlNum, String sku, String type,
			Double originalSRP, Double normalCost, Double promoPrice,
			Double promoCost, Double ber, String requestNum) {
		this.vlNum		 = new SimpleStringProperty(vlNum);
		this.sku 		 = new SimpleStringProperty(sku);
		this.type 		 = new SimpleStringProperty(type);
		this.originalSRP = new SimpleDoubleProperty(originalSRP);
		this.normalCost  = new SimpleDoubleProperty(normalCost);
		this.promoPrice  = new SimpleDoubleProperty(promoPrice);
		this.promoCost   = new SimpleDoubleProperty(promoCost);
		this.ber 		 = new SimpleDoubleProperty(ber);
		this.requestNum  = new SimpleStringProperty(requestNum);
	}
	
	public StringProperty requestNumProperty() { return requestNum; }
	
	public String getRequestNum() { return requestNum.get(); }

	
	public StringProperty vlNumProperty() { return vlNum; }
	
	public String getVlNum() { return vlNum.get(); }
	

	public StringProperty skuProperty() { return sku; }
	
	public String getSku() { return sku.get(); }
	
	
	public StringProperty typeProperty() { return type; }
	
	public String getType() { return type.get(); }
	
	
	public DoubleProperty originalSRPProperty() { return originalSRP; }
	
	public Double getSRP() { return originalSRP.get(); }
	
	
	public DoubleProperty normalCostProperty() { return normalCost; }
	
	public Double getNormalCost() { return normalCost.get(); }
	
	
	public DoubleProperty promoPriceProperty() { return promoPrice; }
	
	public Double getPromoPrice() { return promoPrice.get(); }
	
	
	public DoubleProperty promoCostProperty() { return promoCost; }
	
	public Double getPromoCost() { return promoCost.get(); }
	
	
	public DoubleProperty berProperty() { return ber; }
	
	public Double getBer() { return ber.get(); }
	
	
	public ArrayList<String> getItemStrings() {
		strings.add(getVlNum());
		strings.add(getSku());
		strings.add(getType());
		return strings;
	}
	
	public ArrayList<Double> getItemDoubles() {
		doubles.add(getSRP());
		doubles.add(getNormalCost());
		doubles.add(getPromoPrice());
		doubles.add(getPromoCost());
		doubles.add(getBer());
		return doubles;
	}

}
