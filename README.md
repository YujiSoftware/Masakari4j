# Masakari4j
Javaでマサカリ投げてみた

#実行方法

1. [Download Zip](https://github.com/YujiSoftware/Masakari4j/archive/master.zip) をクリックし、コード一式をダウンロードます。
2. JDKへのパスを通したうえで、下記のコマンドを実行します。

```sh
sh compile.sh
java -noverify Main
```

#デバッグ方法

##準備
 1. [Download Zip](https://github.com/YujiSoftware/Masakari4j/archive/master.zip) をクリック、コード一式をダウンロードします。
 2. JDKへのパスを通したうえで、compile.sh または compile.bat を実行します。
 3. eclipse などのIDEで新規プロジェクトを作成し、そこに Main.java, Masakari.java を入れます  
 （コンパイルエラーになりますが、気にしないでください）  
![eclipseのワークスペース](Masakari4j/wiki/images/eclipse.png)

##実行
 1. 以下のシェル または コマンドプロンプトで、コンパイルしたプログラムを実行します。
（実行後、"Listening for transport dt_socket at address: 8888" と表示された状態で停止します。これは、デバッガのアタッチを待っているためです）

```sh
java -noverify -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:8888,server=y,suspend=y Main
```

##アタッチ(eclipseの場合)
 1. メニューの "実行"→"デバッグの構成" をクリックします。
 2. リモート Java アプリケーションをクリックし、"新規" ボタンをクリックします。
 3. 以下の設定を行い "Debug" ボタンをクリックします。    
 （そのままだとすぐに終了するので、適当なところでブレークポイントを設定するなどしてください）
 ![デバッグの構成](Masakari4j/wiki/images/DebugConfiguration.png)

|プロジェクト|ホスト|ポート|
|---|---|---|
|Masakari4j|localhost|8888|

再度アタッチする場合は、「実行」からやり直してください
