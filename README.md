# Regex2
1. 課題は**正規表現**をたくさん使う。  
2. Listにランダムな文字列（色々自分で入れてもいいし、chatGPTとかにお願いしてもいい）を30個ほど入れてください。  
3. その文字列のリストに対して「数字だけを抜き出す正規表現」と「文字列だけを抜き出す正規表現」を試してみてください。
   実際に合ってるか確認してください。  
4. 更にそれが出来たら文字を抜き出すときに英数字の大文字だけ抜き出してください。  
5. 更に更にそれが出来たら、漢字、ひらがな、カタカナなどの日本語にマッチする正規表現を書いて抜き出してください。  
6. 更に更に更にそれが出来たら、英数字以外の文字を抜き出すという正規表現をチャレンジしてみてください。

# 正規表現
* 数字 → [\d]
* 連続する数字　→　[\d+] ※以下同様に連続するときは語尾に「+」を入れる
* 文字　→　[a-zA-Z]
* 大文字英数字　→　[A-Z0-9]
* ひらがな　→　[\u3040-\u309F]
* カタカナ　→[\u30A0-\u30FF]
* 漢字　→　[\u4E00-\u9FAF]
* 英数字以外　→　[^a-zA-Z0-9]

# やったこと
講義の内容はMapのバリューを表示する（バリューの値をすべて表示）内容であったが、課題はピンポイントで●●だけを抜き出すとあったため、  
patternで●●にマッチする定義づけを行い、matcherで文字列に対するマッチする値を作成した。

# 結果
![image](https://github.com/kuroninja-tatsurooo/Regex2/assets/157494201/70a4e6ed-445a-4164-b92b-bbb7834a7877)
