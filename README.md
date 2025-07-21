# DriveMateKMM 🚗

Kotlin Multiplatform（KMM）で開発したドライバー管理アプリです。  
Android（Jetpack Compose）とiOS（SwiftUI）のネイティブUIで動作します。

---

## 主な機能

- 管理者・ドライバー・エクスパットのログイン
- ネイティブUIダッシュボード（Android & iOS）
- 出退勤記録、車両チェックリスト、日次PDFレポート
- ドライバーのリアルタイム追跡（今後実装予定）
- タスク通知

---

## スクリーンショット

<!-- ここにアプリのスクリーンショットを貼り付けてください -->
<!-- 例: ![Androidダッシュボード](path/to/android-screenshot.png) -->

---

## インストール & 実行方法

```bash
git clone https://github.com/iskandarjajuri/DriveMateKMM.git
cd DriveMateKMM

	•	Android: androidApp/をAndroid Studioで開いて「Run」
	•	iOS: iosApp/でpod install実行 → iosApp.xcworkspaceをXcodeで開いて「Run」
使用例
val user = UserRepositoryImpl().getUserById("123")
println(user.name)
コントリビューション

バグ報告や機能提案はIssueまたはPull Requestでお願いします。

⸻

ライセンス

MIT © 2025 Iskandar Jajuri

⸻

連絡先
	•	https://www.linkedin.com/in/iskandar-jajuri-7366b911a/
	•	メール: iskandarjajuri@gmail.com
