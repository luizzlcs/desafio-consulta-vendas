package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.projection.SummaryMinProjection;

public class SummaryMinDTO {
    private String sellerName;
    private Double total;

    public SummaryMinDTO(String sellerName, Double total) {
        this.sellerName = sellerName;
        this.total = total;
    }

    public SummaryMinDTO(SummaryMinProjection projection){
        sellerName = projection.sellerName();
        total = projection.total();
    }

    public String getSellerName() {
        return sellerName;
    }

    public Double getTotal() {
        return total;
    }
    
}
