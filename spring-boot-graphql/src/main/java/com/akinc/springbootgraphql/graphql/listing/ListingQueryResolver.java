package com.akinc.springbootgraphql.graphql.listing;

import com.akinc.springbootgraphql.model.response.ListingResponse;
import com.akinc.springbootgraphql.service.listing.ListingService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ListingQueryResolver implements GraphQLQueryResolver {

    private final ListingService listingService;

    public List<ListingResponse> getAllListing() {
        return listingService.getAllListing();
    }

    public ListingResponse getListingById(Long id) {
        return listingService.getListingById(id).orElse(null);
    }
}
