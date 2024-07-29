package tech.intellispaces.actions.onetime;

import tech.intellispaces.actions.Action;

import java.util.function.Function;

public interface NotFirstTimeOnlyActions {

  static <V, D1, D2, D3, D4, D5> Function<Action<V, D1, D2, D3, D4, D5>, Action<V, D1, D2, D3, D4, D5>> factory() {
    return NotFirstTimeOnlyAction::new;
  }
}