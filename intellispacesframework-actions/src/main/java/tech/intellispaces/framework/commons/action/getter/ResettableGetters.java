package tech.intellispaces.framework.commons.action.getter;

public interface ResettableGetters {

  static <V> ResettableGetterImpl<V> get() {
    return new ResettableGetterImpl<>();
  }

  static <V> ResettableGetterImpl<V> get(V initValue) {
    return new ResettableGetterImpl<>(initValue);
  }
}