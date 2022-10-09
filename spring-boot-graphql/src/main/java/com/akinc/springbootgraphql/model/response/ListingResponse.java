package com.akinc.springbootgraphql.model.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListingResponse {

    private Long id;

    private String title;

    private BigDecimal price;

    private ListingState state;

    private String publishedAt;

}
