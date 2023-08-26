package com.aronsoft.webmvc.service;

import com.aronsoft.webmvc.entity.KelasEntity;
import com.aronsoft.webmvc.model.KelasModel;

import java.util.List;
import java.util.Optional;

public interface KelasService {
    public List<KelasModel> get();
    public Boolean validKode(KelasModel request);
    public Boolean validNamaHari(KelasModel request);
    public KelasModel getById(String id);
    public Optional<KelasModel> save(KelasModel request);
    public Optional<KelasModel> update( String id, KelasModel request);
    public Optional<KelasModel> delete( String id);

}
