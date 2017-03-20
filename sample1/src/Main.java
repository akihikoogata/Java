

import java.util.ArrayList;
import java.util.List;

import businesslogic.ProcesHoge01;
import businesslogic.ProcesHoge02;
import dto.BarInfoDto;
import dto.FooInfoDto;

public class Main {

  public static void main(String[] args) {

    //処理結果を保管するDTOリスト
    List<BarInfoDto> out = new ArrayList<BarInfoDto>();

    //処理対象となる入力DTOリストを用意
    List<FooInfoDto> in = new ArrayList<FooInfoDto>();
    for(int i=1 ; i<4 ; i++){
      FooInfoDto dto = new FooInfoDto();
      dto.setId(i);
      dto.setValue(i+"番目の値");

      //処理対象となる入力DTOリストにセット
      in.add(dto);

      //処理結果を保管するDTOリストには空のDTOオブジェクトをセット
      out.add(new BarInfoDto());

    }

    new ProcesHoge01().execute(in, out);
    //結果表示
    for(BarInfoDto dto : out) {
      System.out.println( "-------------------------------" );
      System.out.println( "処理後のID    > " + dto.getId() );
      System.out.println( "処理後のValue > " + dto.getValue() );
    }


    new ProcesHoge02().execute(in, out);
    //結果表示
    for(BarInfoDto dto : out) {
      System.out.println( "-------------------------------" );
      System.out.println( "処理後のID    > " + dto.getId() );
      System.out.println( "処理後のValue > " + dto.getValue() );
    }

  }

}
