package com.akinc.springbootgraphql.service.listing;

import com.akinc.springbootgraphql.model.request.ListingRequest;
import com.akinc.springbootgraphql.model.response.ListingResponse;

import java.util.List;
import java.util.Optional;

public interface ListingService {

    List<ListingResponse> getAllListing();

    Optional<ListingResponse> getListingById(Long id);

    Boolean addListing(ListingRequest listingRequest);
}
