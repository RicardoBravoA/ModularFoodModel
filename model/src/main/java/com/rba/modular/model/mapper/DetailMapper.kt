package com.rba.modular.model.mapper

import com.rba.modular.model.entity.response.RestaurantDetailResponse
import com.rba.modular.model.model.DetailModel

object DetailMapper {

    fun transform(restaurantDetailResponse: RestaurantDetailResponse): DetailModel {

        val detailModel = DetailModel()
        detailModel.id = restaurantDetailResponse.id
        detailModel.apikey = restaurantDetailResponse.apikey
        detailModel.name = restaurantDetailResponse.name
        detailModel.url = restaurantDetailResponse.url
        detailModel.latitude = restaurantDetailResponse.location?.latitude
        detailModel.longitude = restaurantDetailResponse.location?.longitude
        detailModel.cuisines = restaurantDetailResponse.cuisines
        detailModel.popularity = restaurantDetailResponse.userRating?.aggregateRating
        detailModel.thumb = restaurantDetailResponse.thumb
        detailModel.timings = restaurantDetailResponse.timings
        detailModel.phoneNumbers = restaurantDetailResponse.phoneNumbers
        detailModel.address = restaurantDetailResponse.location?.address
        return detailModel
    }

}