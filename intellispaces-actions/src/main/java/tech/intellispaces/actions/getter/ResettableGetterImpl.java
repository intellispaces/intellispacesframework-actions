package tech.intellispaces.actions.getter;

import tech.intellispaces.actions.ResettableGetter;

class ResettableGetterImpl<V> extends AbstractGetter<V> implements ResettableGetter<V> {
  private V value;

  ResettableGetterImpl() {}

  ResettableGetterImpl(V value) {
    this.value = value;
  }

  @Override
  public V get() {
    return value;
  }

  @Override
  public void set(V value) {
    this.value = value;
  }
}