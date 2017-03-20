package businesslogic;

import java.util.List;

import dto.BarInfoDto;
import dto.FooInfoDto;

public class ProcesHoge01 extends Proces {

  public ProcesHoge01() {
    // TODO 自動生成されたコンストラクター・スタブ
  }

  @Override
  protected String getProcesName() {
    return "Hoge01処理";
  }

  @Override
  protected void proces(List<FooInfoDto> input, List<BarInfoDto> output) {

    // 実際のHoge処理内容
    int index = 0;
    for( FooInfoDto dto : input ) {

      Integer tmpId = dto.getId()*10;
      output.get(index).setId(tmpId);

      String tmpValue = dto.getValue()+"_Hoge01";
      output.get(index).setValue(tmpValue);


      index++;
    }

  }

}
