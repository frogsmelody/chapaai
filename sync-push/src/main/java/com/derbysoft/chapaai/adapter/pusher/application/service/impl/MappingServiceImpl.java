package com.derbysoft.chapaai.adapter.pusher.application.service.impl;

import com.derbysoft.chapaai.adapter.pusher.application.service.MappingService;
import com.derbysoft.chapaai.adapter.pusher.domain.repository.HotelRepository;
import com.derbysoft.chapaai.adapter.pusher.domain.repository.RatePlanRepository;
import com.derbysoft.chapaai.adapter.pusher.domain.repository.RoomTypeRepository;

public class MappingServiceImpl implements MappingService {

    private RatePlanRepository ratePlanRepository;

    private RoomTypeRepository roomTypeRepository;

    private HotelRepository hotelRepository;
    @Override
    public String translateRatePlan(String ratePlanCode) {
        return ratePlanRepository.getRatePlan(ratePlanCode).getChannelRatePlanCode();
    }

    @Override
    public String translateRoomType(String roomTypeCode) {
        return roomTypeRepository.getRoomType(roomTypeCode).getChannelRoomTypeCode();
    }

    @Override
    public String translateHotelCode(String hotelCode) {
        return hotelRepository.getHotel(hotelCode).getChannelHotelCode();
    }

    public RoomTypeRepository getRoomTypeRepository() {
        return roomTypeRepository;
    }

    public void setRoomTypeRepository(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    public RatePlanRepository getRatePlanRepository() {
        return ratePlanRepository;
    }

    public void setRatePlanRepository(RatePlanRepository ratePlanRepository) {
        this.ratePlanRepository = ratePlanRepository;
    }
}
