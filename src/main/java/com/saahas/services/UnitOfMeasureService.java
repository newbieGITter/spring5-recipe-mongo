package com.saahas.services;

import java.util.Set;

import com.saahas.commands.UnitOfMeasureCommand;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
