package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
class a {
    static final int INDEX_ILLEGAL = -2;
    static final int INDEX_ZERO = -1;
    int currentIndex;
    public boolean hasNext;
    final LongMap map;
    int nextIndex;

    public a(LongMap longMap) {
        this.map = longMap;
        reset();
    }

    public void reset() {
        this.currentIndex = INDEX_ILLEGAL;
        this.nextIndex = -1;
        if (this.map.hasZeroValue) {
            this.hasNext = true;
        } else {
            findNextIndex();
        }
    }

    void findNextIndex() {
        this.hasNext = false;
        long[] jArr = this.map.keyTable;
        int i = this.map.capacity + this.map.stashSize;
        do {
            int i2 = this.nextIndex + 1;
            this.nextIndex = i2;
            if (i2 >= i) {
                return;
            }
        } while (jArr[this.nextIndex] == 0);
        this.hasNext = true;
    }

    public void remove() {
        if (this.currentIndex == -1 && this.map.hasZeroValue) {
            this.map.zeroValue = null;
            this.map.hasZeroValue = false;
        } else {
            if (this.currentIndex < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            if (this.currentIndex >= this.map.capacity) {
                this.map.removeStashIndex(this.currentIndex);
            } else {
                this.map.keyTable[this.currentIndex] = 0;
                this.map.valueTable[this.currentIndex] = null;
            }
        }
        this.currentIndex = INDEX_ILLEGAL;
        LongMap longMap = this.map;
        longMap.size--;
    }
}
