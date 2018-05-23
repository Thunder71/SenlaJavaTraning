package com.Senla.store.istores;

import com.Senla.model.Repairer;

public interface IStoreRepairer {
    void addRepairer(Repairer newRepairer);

    void removeRepairer(Repairer repairer);
}
