package com.trybe.dataatual.services;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.stereotype.Service;

import com.trybe.dataatual.entities.Data;

@Service
public class DataService {
  public Data retornaDataAtual() {
    return new Data(LocalDateTime.now(ZoneId.of("UTC")));
  }
}
