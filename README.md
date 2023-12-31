# MyCalendarForm
MyCalendarFormは、JavaとSpring Frameworkを使用して開発されたウェブベースのカレンダーアプリケーションです。　　
ユーザーが自分の予定を簡単に追加できる機能を備えています。　　

## 学習資料
このプロジェクトは以下の教材を参考にしました：
- [【Javaプログラマー必須】最強のフレームワーク、Spring。環境構築、Thymeleaf画面作成、依存性の注入まで。](https://www.udemy.com/course/javaspringdi/)　　
- [Spring 入門 ～ SpringBoot 2 を使ってお問い合わせアプリとToDoアプリを作る ～](https://www.udemy.com/course/java_spring_beginner/)　　

## プロジェクトの背景と目的
このプロジェクトは、Javaの広範な利用と転職活動におけるその重要性を背景に、Javaおよび関連技術の習得を目的として始めました。  
日常生活で頻繁に利用するカレンダーアプリを選び、実用的な学習の一環として開発を行っています。  
このプロジェクトを通じて、JavaやHTMLの基本的な知識を深めると共に、開発の過程で遭遇する様々な課題を解決するためにリサーチや実践を行っています。  

## 主要機能  
カレンダー予定の追加：ユーザーは日付、開始時間、終了時間、説明を入力して予定を追加できます。  
  
## 技術スタック  
- Spring Boot：アプリケーションの基盤として使用。  
- Thymeleaf：サーバーサイドのテンプレートエンジンとして使用し、動的なウェブページを生成。  
- Java Bean Validation：フォームの入力値に対するバリデーションを実装。  

## コードの構成
- AppointmentFormクラス：予定のデータを保持するモデルクラス。
- HTMLフォーム：Thymeleafテンプレートを使用し、予定の入力フォームを表示。th:objectを使ってAppointmentFormオブジェクトにバインド。
- CalendarControllerクラス：  
  * @GetMappingでカレンダーのフォームを表示するためのエンドポイントを提供。
  * @PostMappingでフォームの送信を処理し、入力値のバリデーションとデータ処理を行う。  

## プロジェクトを通じての学び　　  
MyCalendarFormプロジェクトは、プログラミングとソフトウェア開発の基本を学ぶための実践的な手段となりました。以下は、この経験から得られた主要な洞察です。　　  
  
- 基本的な開発フローの理解：Spring BootやThymeleafの基本的な使い方に触れ、ウェブアプリケーションの基礎構造を理解しました。    　
- データの扱い方：フォームからデータを受け取り、バックエンドで処理する基本的な流れを学びました。   
- バリデーションの概念：入力データのバリデーションがなぜ重要なのか、その目的を理解し、基本的なバリデーションルールを実装することで、その重要性を実感しました。  
- エラーハンドリング：開発中に遭遇したエラーメッセージを元に、問題解決のための情報を検索し、解決策を適用する経験を積みました。  
- リソースの活用：Udemyのコースを参考にしながら、独学で技術を学び、未知の問題に取り組む方法を学びました。  
  
このプロジェクトは、プログラミングの基礎を理解し、新しい技術に適応する能力を養うための第一歩となりました。技術的な深掘りよりも  　
全体的な流れをつかみ、基本を理解することに主眼を置きました。実際の開発プロセスや、それに伴う問題解決の経験は、今後の学習の指針となる貴重なものでした　
