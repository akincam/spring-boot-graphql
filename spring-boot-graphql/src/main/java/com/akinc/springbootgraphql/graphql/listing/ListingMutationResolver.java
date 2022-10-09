package com.akinc.springbootgraphql.graphql.listing;

import com.akinc.springbootgraphql.model.request.ListingRequest;
import com.akinc.springbootgraphql.service.listing.ListingService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ListingMutationResolver implements GraphQLMutationResolver {

    private final ListingService listingService;

    public Boolean addListing(ListingRequest listingRequest) {
        return listingService.addListing(listingRequest);
    }
}
