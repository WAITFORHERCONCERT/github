package com.sdata.ecommerce.api.search;

import com.sdata.ecommerce.api.PageableResponse;
import com.sdata.ecommerce.exception.ErrorCode;

/**
 * @author nedli
 */
public class SearchResponse<T> extends PageableResponse<T> {
    public SearchResponse(long total) {
        super(total);
    }

    public SearchResponse(T data, long total) {
        super(data, total);
    }

    public SearchResponse(ErrorCode errorCode, long total) {
        super(errorCode, total);
    }
}
