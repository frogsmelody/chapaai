package com.derbysoft.chapaai.adapter.pusher.application.service;

import com.derbysoft.synchronizer.dto.ChangesDTO;

public interface FilterPolicy {

   boolean accept(ChangesDTO changesDTO);

}
