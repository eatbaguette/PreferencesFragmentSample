# 概要
Preference Fragment を使って設定画面を作る

# 機能
PrefereceFragment
SharedPreferenceから呼び出し
MainActivity -> SettingActivity -> PreferenceDemoFragment を呼ぶパターンと
MainActivity -> PreferencesDemoFragment を呼ぶパターンをスイッチで呼び分け。後者はボタンを消す処理が必要。


# 詰まった点とか
PreferenceFragmentはPreferenceFragmentCompatを使う。
PreferenceFragmentCompatを使うときには、supportFragmentManagerを使う。


# 参考URL
https://developer.android.com/guide/topics/ui/settings.html?hl=ja
http://java-lang-programming.com/ja/articles/63
