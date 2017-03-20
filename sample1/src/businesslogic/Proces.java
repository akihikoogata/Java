package businesslogic;

import java.util.List;

import dto.BarInfoDto;
import dto.FooInfoDto;

public abstract class Proces {

  //
  protected abstract String getProcesName();

  //
  protected abstract void proces(List<FooInfoDto> input , List<BarInfoDto> output);

  //
  public void execute(List<FooInfoDto> in, List<BarInfoDto> out) {

    System.out.println( getProcesName() + "の処理開始。" );

    proces(in, out);

    System.out.println( getProcesName() + "の処理終了。" );

  }

}
