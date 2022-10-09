package com.akinc.springbootgraphql.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListingRequest {

    private String title;

    private BigDecimal price;

    private String publishedAt;

}
