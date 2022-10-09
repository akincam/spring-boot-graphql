package com.akinc.springbootgraphql.model.response;

import lombok.Getter;

@Getter
public enum ListingState {

    TEMP,
    DRAFT,
    DELETED,
    PRIVATE,
    PUBLISHED;
}
