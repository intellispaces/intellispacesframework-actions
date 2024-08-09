package tech.intellispaces.actions;

import tech.intellispaces.commons.exception.UnexpectedViolationException;

import java.util.function.Function;

public abstract class AbstractAction3<R, D1, D2, D3> implements Action3<R, D1, D2, D3> {

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4) {
    return execute(data1, data2, data3);
  }

  @Override
  public R execute(D1 data1, D2 data2, D3 data3, Void data4, Void data5) {
    return execute(data1, data2, data3);
  }

  @Override
  public <$R> Action0<$R> asAction0() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action0");
  }

  @Override
  public <$R, $D> Action1<$R, $D> asAction1() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action1");
  }

  @Override
  public <$R, $D1, $D2> Action2<$R, $D1, $D2> asAction2() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action2");
  }

  @Override
  @SuppressWarnings("unchecked")
  public Action3<R, D1, D2, D3> asAction3() {
    return this;
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4> Action4<$R, $D1, $D2, $D3, $D4> asAction4() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action4");
  }

  @Override
  public <$R, $D1, $D2, $D3, $D4, $D5> Action5<$R, $D1, $D2, $D3, $D4, $D5> asAction5() {
    throw UnexpectedViolationException.withMessage("Attempt to cast incompatible types of actions. " +
        "Action3 can not be casted to Action5");
  }

  @Override
  public <A extends Action3<_R, _D1, _D2, _D3>, _R, _D1, _D2, _D3> A wrapAction3(
      Function<Action3<R, D1, D2, D3>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <A extends Action4<_R, _D1, _D2, _D3, _D4>, _R, _D1, _D2, _D3, _D4> A wrapAction4(
      Function<Action4<R, D1, D2, D3, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }

  @Override
  public <A extends Action5<_R, _D1, _D2, _D3, _D4, _D5>, _R, _D1, _D2, _D3, _D4, _D5> A wrapAction5(
      Function<Action5<R, D1, D2, D3, Void, Void>, A> wrapperFactory
  ) {
    return wrapperFactory.apply(this);
  }
}