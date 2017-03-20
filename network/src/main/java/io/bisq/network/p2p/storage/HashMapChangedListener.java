package io.bisq.network.p2p.storage;

import io.bisq.wire.payload.p2p.storage.ProtectedStorageEntry;

public interface HashMapChangedListener {
    void onAdded(ProtectedStorageEntry data);

    void onRemoved(ProtectedStorageEntry data);
}