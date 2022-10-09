package com.akinc.springbootgraphql.service.listing;

import com.akinc.springbootgraphql.model.request.ListingRequest;
import com.akinc.springbootgraphql.model.response.ListingResponse;
import com.akinc.springbootgraphql.model.response.ListingState;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ListingServiceImpl implements ListingService {

    private static final List<ListingResponse> listingResponseList = new ArrayList<>();

    @Override
    public List<ListingResponse> getAllListing() {
        return listingResponseList;
    }

    @Override
    public Optional<ListingResponse> getListingById(Long id) {
        return listingResponseList.stream().filter(l -> l.getId().equals(id)).findFirst();
    }

    @Override
    public Boolean addListing(ListingRequest listingRequest) {
        return listingResponseList.add(ListingResponse.builder()
                                               .id(listingResponseList.size()+ 1L)
                                               .title(listingRequest.getTitle())
                                               .price(listingRequest.getPrice())
                                               .publishedAt(listingRequest.getPublishedAt())
                                               .state(ListingState.DRAFT)
                                               .build());
    }
}
