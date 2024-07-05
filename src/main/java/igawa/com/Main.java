package igawa.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Map<String, String> addressMap = new HashMap<>();
    addressMap.put("tetsu", "happy12@GMAIL.com");
    addressMap.put("shoichi", "first@gmail.com");
    addressMap.put("gen", "genki@yahoo.co.jp");
    addressMap.put("jin", "jinjin.co.jp");
    addressMap.put("KANEKO","555@docomo.ne.jp");
    addressMap.put("sakura","ハロー@do.ne.jp");
    addressMap.put("ume","うまい@beer.ne.jp");
    addressMap.put("take","竹@bamboo.ne.jp");
    addressMap.put("white","ホワイト@haccur.ne.jp");
    addressMap.put("black","BLACK@yami.ne.jp");
    addressMap.put("blue","青@color.ne.jp");
    addressMap.put("maru","○@まる.ne.jp");
    addressMap.put("batu","BuD@b.co.jp");
    addressMap.put("sankaku","三角@onigiri");
    addressMap.put("gon","Power@power.ne.jp");
    addressMap.put("lukia","baribari@雷.ne.jp");
    addressMap.put("kurapica","制約@誓約");
    addressMap.put("bom","爆弾@booomm.co.jp");
    addressMap.put("spa","温泉@♨");
    addressMap.put("獅子舞","しし@jp");
    addressMap.put("god","神@kumonouenosonzai.jp");
    addressMap.put("bingo","あたり@lucky.go.jp");
    addressMap.put("river","suMMerVacation@go.jp");
    addressMap.put("pool","プール");
    addressMap.put("仙豆","kaifuku@.genki.jp");
    addressMap.put("luckyMAN","motemote?");
    addressMap.put("inoki","3:2:1だぁー");
    addressMap.put("glass","眼鏡@niau?.co.jp");
    addressMap.put("japan","JAPONE");

    List<String> addresList = addressMap.values().stream()
        .filter(s -> s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
        .collect(Collectors.toList());
    System.out.println(addresList);

    List<String> numberList = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\d+"); //数字1個以上にマッチするパターンを定義
    for (String value : addressMap.values()){
      Matcher matcher = pattern.matcher(value); //文字列に対するマッチャーを作成
      while (matcher.find()){//パターンが一致する部分を見つける
          numberList.add(matcher.group());
        }
    }
    System.out.println(numberList);

    List<String> charaList = new ArrayList<>();
    Pattern pattern1 = Pattern.compile("[a-zA-Z]+"); //文字にマッチするパターンを定義
    for (String value1 : addressMap.values()){
      Matcher matcher1 = pattern1.matcher(value1);
      while (matcher1.find()){
        charaList.add(matcher1.group());
      }
    }
    System.out.println(charaList);

    List<String> charaList2 = new ArrayList<>();
    Pattern pattern2 = Pattern.compile("[A-Z0-9]+"); //大文字の英数字にマッチするパターンを定義
    for (String value2 : addressMap.values()){
      Matcher matcher2 = pattern2.matcher(value2);
      while (matcher2.find()){
        charaList2.add(matcher2.group());
      }
    }
    System.out.println(charaList2);

    List<String> japaneseList = new ArrayList<>();
    Pattern pattern3 = Pattern.compile("[\\u3040-\\u309F\\u30A0-\\u30FF\\u4E00-\\u9FAF]+"); //ひらがな、カタカナ、漢字にマッチするパターンを定義
    for (String value3 : addressMap.values()){
      Matcher matcher3 = pattern3.matcher(value3);
      while (matcher3.find()){
        japaneseList.add(matcher3.group());
      }
    }
    System.out.println(japaneseList);

    List<String> exceptAlphanumericList = new ArrayList<>();
    Pattern pattern4 = Pattern.compile("[^a-zA-Z0-9]+"); //英数字以外にマッチするパターンを定義
    for (String value4 : addressMap.values()){
      Matcher matcher4 = pattern4.matcher(value4);
      while (matcher4.find()){
        exceptAlphanumericList.add(matcher4.group());
      }
    }
    System.out.println(exceptAlphanumericList);
  }
}

