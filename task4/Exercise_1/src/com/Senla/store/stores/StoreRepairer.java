package com.Senla.store.stores;

import com.Senla.model.Repairer;
import com.Senla.store.istores.IStoreRepairer;

import java.util.ArrayList;
import java.util.List;

public class StoreRepairer implements IStoreRepairer {
    private List<Repairer> repairers;

    public StoreRepairer(){
        repairers = new ArrayList<>();
    }

    public List<Repairer> getRepairers() {
        return repairers;
    }

    public void setRepairers(List<Repairer> repairers) {
        this.repairers = repairers;
    }

    @Override
    public void addRepairer(Repairer newRepairer) {
        repairers.add(newRepairer);
    }

    @Override
    public void removeRepairer(Repairer repairer) {
        repairers.remove(repairer);
    }
}
