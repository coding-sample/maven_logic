# templateプロジェクトの使い方
1. Webからリポジトリ新規作成。templateを指定
1. pom.xmlのtemplate_logicを変更（2か所）
1. pom.xmlのtemplate_commonを変更（2か所）
1. settingsは引き継がれない
    1. Personal Access Token作成。read:packagesだけでOK
1. リポジトリ作成と同時にactionsが実行され、NGになっている。再実行

# templateプロジェクトの作り方
1. VSCからSpring Initializerで作成
1. setting.xmlを追加、pom.xmlにrepositoryを追加、workflow fileを追加
    1. commonのpackagesを取得
1. webから以下を設定
    1. Personal Access Token作成。read:packagesだけでOK
    1. このリポジトリにPATを追加。有効期限があるので注意
